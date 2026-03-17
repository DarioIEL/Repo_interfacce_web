const postsContainer = document.querySelector('#postsContainer');
const searchInput = document.querySelector('#searchInput');
const statusMessage = document.querySelector('#statusMessage');

const modalOverlay = document.querySelector('#modalOverlay');
const modalContent = document.querySelector('#modalContent');
const closeModalBtn = document.querySelector('#closeModalBtn');

let allPosts = [];

async function fetchPosts() {
    statusMessage.textContent = 'Caricamento in corso...';

    try {
        const response = await fetch("https://jsonplaceholder.typicode.com/posts");

        if (!response.ok) {
            throw new Error("Errore nella risposta del server");
        }

        const data = await response.json();
        allPosts = data.slice(0, 10);

        renderPosts(allPosts);
        statusMessage.textContent = '';
    } catch (error) {
        statusMessage.textContent = 'Errore nel caricamento dei post.';
        console.error(error);
    }
}

function renderPosts(posts) {
    postsContainer.innerHTML = '';

    if (posts.length === 0) {
        postsContainer.innerHTML = '<p>Nessun post trovato</p>'
    }

    posts.forEach(post => {
        const article = document.createElement('article');
        article.classList.add('post-card');

        article.innerHTML = `
        <h2 class="post-title">${post.title}</h2>
        <p class="post-body">${post.body.substring(0, 50)}...</p>
        <button type="button">Apri post</button>
        `;

        const button = article.querySelector('button');

        button.addEventListener("click", () => {
            openModal(post);
        })

        postsContainer.appendChild((article))
    });

}

function openModal(post) {
    modalContent.innerHTML = `
    <h2 class="modal-title">${post.title}</h2>
    <p class="modal-text">${post.body}</p>
    <p><strong>ID Post:</strong> ${post.id}</p>
    <p><strong>ID Utente</strong> ${post.userId}</p>
    `;

    modalOverlay.classList.add('is-open');
}

function closeModal() {
    modalOverlay.classList.remove('is-open');
}

closeModalBtn.addEventListener('click', closeModal);

fetchPosts();