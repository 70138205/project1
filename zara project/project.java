let header = document.querySelector('header');
window.addEventListener('scroll',() ->{
    header.classlist.toggle('shadow',window.scrollY> 0);
});

var swipper new Swipper(".home",{
    spaceBetween: 30,
    centeredSlides: true,
    autoplay: {
        delay: 5000;
        disableonInteraction: false,
    },
    pagination: {
        el:".swiper-pagination",
        clickable: true,
    },
});

