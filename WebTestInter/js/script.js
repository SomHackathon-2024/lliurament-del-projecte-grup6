document.addEventListener('DOMContentLoaded', function () {
    const dots = document.querySelectorAll('.marine-image .info-dot');

    dots.forEach(dot => {
        const dotButton = dot.previousElementSibling;
        dotButton.addEventListener('click', () => {
            // Ocultar todas las informaciones antes de mostrar la correcta
            dots.forEach(info => {
                info.style.display = 'none';
            });
            // Mostrar la información correspondiente al punto en el que se hizo clic
            dot.style.display = (dot.style.display === 'none') ? 'block' : 'none';
        });
    });
});
