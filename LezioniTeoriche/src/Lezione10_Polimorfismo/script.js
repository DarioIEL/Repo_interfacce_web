// ── Hamburger menu ──
const hamburger = document.getElementById('hamburger');
const navLinks  = document.getElementById('navLinks');

hamburger.addEventListener('click', () => navLinks.classList.toggle('open'));
navLinks.querySelectorAll('a').forEach(a =>
  a.addEventListener('click', () => navLinks.classList.remove('open'))
);

// ── Active nav highlight on scroll ──
const sections = document.querySelectorAll('section[id]');
const navAs    = document.querySelectorAll('.nav-links a');

const navObserver = new IntersectionObserver(entries => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      navAs.forEach(a =>
        a.classList.toggle('active', a.getAttribute('href') === '#' + e.target.id)
      );
    }
  });
}, { threshold: .35 });

sections.forEach(s => navObserver.observe(s));

// ── Animate elements on scroll ──
const animItems = document.querySelectorAll(
  '.timeline-item, .edu-card, .skill-cat, .project-card, .cert-item, .lang-card, .hobby-pill'
);

const animObserver = new IntersectionObserver(entries => {
  entries.forEach((e, i) => {
    if (e.isIntersecting) {
      setTimeout(() => e.target.classList.add('visible'), i * 80);
      animObserver.unobserve(e.target);
    }
  });
}, { threshold: .15 });

animItems.forEach(el => animObserver.observe(el));

// ── Skill bar fill on scroll ──
const barItems = document.querySelectorAll('.skill-bar-fill');

const barObserver = new IntersectionObserver(entries => {
  entries.forEach(e => {
    if (e.isIntersecting) {
      e.target.style.width = e.target.dataset.width + '%';
      barObserver.unobserve(e.target);
    }
  });
}, { threshold: .3 });

barItems.forEach(b => barObserver.observe(b));
