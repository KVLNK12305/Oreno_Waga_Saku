document.addEventListener('DOMContentLoaded', () => {
    // Services Section: Constellation Effect
    const stars = document.querySelectorAll('.star');
    const expertiseCards = document.querySelectorAll('.expertise-card');
    const closeButtons = document.querySelectorAll('.close-btn');
    const lines = document.querySelectorAll('.constellation-line');

    // Function to position expertise card near the clicked star
    function positionCard(star, card) {
        const starRect = star.getBoundingClientRect();
        const containerRect = document.querySelector('.constellation-container').getBoundingClientRect();
        const cardWidth = card.offsetWidth;
        const cardHeight = card.offsetHeight;

        let left = starRect.left - containerRect.left + starRect.width / 2 - cardWidth / 2;
        let top = starRect.top - containerRect.top + starRect.height;

        // Ensure card stays within viewport
        if (left + cardWidth > containerRect.width) {
            left = containerRect.width - cardWidth - 10;
        }
        if (left < 0) {
            left = 10;
        }
        if (top + cardHeight > containerRect.height) {
            top = starRect.top - containerRect.top - cardHeight - 10;
        }

        card.style.left = `${left}px`;
        card.style.top = `${top}px`;
    }

    // Function to draw line between two stars
    function drawLine(line, star1, star2) {
        const star1Rect = star1.getBoundingClientRect();
        const star2Rect = star2.getBoundingClientRect();
        const containerRect = document.querySelector('.constellation-container').getBoundingClientRect();

        const x1 = star1Rect.left - containerRect.left + star1Rect.width / 2;
        const y1 = star1Rect.top - containerRect.top + star1Rect.height / 2;
        const x2 = star2Rect.left - containerRect.left + star2Rect.width / 2;
        const y2 = star2Rect.top - containerRect.top + star2Rect.height / 2;

        const length = Math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2);
        const angle = Math.atan2(y2 - y1, x2 - x1) * (180 / Math.PI);

        line.style.width = `${length}px`;
        line.style.left = `${x1}px`;
        line.style.top = `${y1}px`;
        line.style.transform = `rotate(${angle}deg)`;
        line.style.opacity = '1';
    }

    // Reset all stars, cards, and lines
    function resetAll() {
        stars.forEach(star => star.classList.remove('active'));
        expertiseCards.forEach(card => card.classList.remove('visible'));
        lines.forEach(line => line.style.opacity = '0');
    }

    // Handle star click
    stars.forEach(star => {
        star.addEventListener('click', () => {
            const id = star.dataset.id;
            const card = document.querySelector(`.expertise-card[data-id="${id}"]`);

            if (star.classList.contains('active')) {
                resetAll();
                return;
            }

            resetAll();
            star.classList.add('active');
            card.classList.add('visible');
            positionCard(star, card);

            // Draw lines based on star connections
            if (id === '1') {
                drawLine(document.getElementById('line-1-2'), star, document.querySelector('.star[data-id="2"]'));
            } else if (id === '2') {
                drawLine(document.getElementById('line-1-2'), document.querySelector('.star[data-id="1"]'), star);
                drawLine(document.getElementById('line-2-3'), star, document.querySelector('.star[data-id="3"]'));
            } else if (id === '3') {
                drawLine(document.getElementById('line-2-3'), document.querySelector('.star[data-id="2"]'), star);
                drawLine(document.getElementById('line-3-4'), star, document.querySelector('.star[data-id="4"]'));
            } else if (id === '4') {
                drawLine(document.getElementById('line-3-4'), document.querySelector('.star[data-id="3"]'), star);
            }
        });
    });

    // Handle close button click
    closeButtons.forEach(button => {
        button.addEventListener('click', () => {
            resetAll();
        });
    });

    // Handle clicks outside cards to close them
    document.addEventListener('click', (e) => {
        if (!e.target.closest('.star') && !e.target.closest('.expertise-card')) {
            resetAll();
        }
    });

    // Mobile Navigation Toggle
    const openBtn = document.getElementById('open');
    const closeBtn = document.getElementById('cls');
    const navUl = document.querySelector('nav ul');

    if (openBtn && closeBtn && navUl) {
        openBtn.addEventListener('click', () => {
            navUl.style.right = '0';
        });

        closeBtn.addEventListener('click', () => {
            navUl.style.right = '-200px';
        });
    }
});