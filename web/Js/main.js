(function ($) {
  "user strict";

  // preloader
  $(".preloader").delay(1000).animate({
    "opacity": "0"
  }, 1000, function () {
      $(".preloader").css("display", "none");
  });

  // lightcase
  $(window).on('load', function () {
    $("a[data-rel^=lightcase]").lightcase();
  })

// wow
if ($('.wow').length) {
  var wow = new WOW({
    boxClass: 'wow',
    // animated element css class (default is wow)
    animateClass: 'animated',
    // animation css class (default is animated)
    offset: 0,
    // distance to the element when triggering the animation (default is 0)
    mobile: false,
    // trigger animations on mobile devices (default is true)
    live: true // act on asynchronously loaded content (default is true)
  });
  wow.init();
}

//Create Background Image
(function background() {
  var img = $('.bg_img');
  img.css('background-image', function () {
    var bg = ('url(' + $(this).data('background') + ')');
    return bg;
  });
})();


// header-fixed
var fixed_top = $(".header-section");
$(window).on("scroll", function(){
    if( $(window).scrollTop() > 500){  
        fixed_top.addClass("animated fadeInDown header-fixed");
    }
    else{
        fixed_top.removeClass("animated fadeInDown header-fixed");
    }
});

// navbar-click
$(".navbar li a").on("click", function () {
  var element = $(this).parent("li");
  if (element.hasClass("show")) {
    element.removeClass("show");
    element.find("li").removeClass("show");
  }
  else {
    element.addClass("show");
    element.siblings("li").removeClass("show");
    element.siblings("li").find("li").removeClass("show");
  }
});

// scroll-to-top
var ScrollTop = $(".scrollToTop");
$(window).on('scroll', function () {
  if ($(this).scrollTop() < 500) {
      ScrollTop.removeClass("active");
  } else {
      ScrollTop.addClass("active");
  }
});

//Odometer
  if ($(".statistics-item").length) {
    $(".statistics-item").each(function () {
    $(this).isInViewport(function (status) {
      if (status === "entered") {
        for (var i = 0; i < document.querySelectorAll(".odometer").length; i++) {
          var el = document.querySelectorAll('.odometer')[i];
          el.innerHTML = el.getAttribute("data-odometer-final");
        }
      }
    });
  });
}

// slider
var swiper = new Swiper('.client-slider', {
  slidesPerView: 2,
  spaceBetween: 30,
  loop: true,
  pagination: {
    el: '.swiper-pagination',
    clickable: true,
  },
  autoplay: {
    speed: 1000,
    delay: 3000,
  },
  speed: 1000,
  breakpoints: {
    991: {
      slidesPerView: 2,
    },
    767: {
      slidesPerView: 1,
    },
    575: {
      slidesPerView: 1,
    },
  }
});

var swiper = new Swiper('.schedule-slider', {
  slidesPerView: 2,
  spaceBetween: 30,
  loop: true,
  navigation: {
    nextEl: '.slider-next',
    prevEl: '.slider-prev',
  },
  autoplay: {
    speed: 1000,
    delay: 3000,
  },
  speed: 1000,
  breakpoints: {
    991: {
      slidesPerView: 2,
    },
    767: {
      slidesPerView: 1,
    },
    575: {
      slidesPerView: 1,
    },
  }
});

// faq
$('.faq-wrapper .faq-title').on('click', function (e) {
  var element = $(this).parent('.faq-item');
  if (element.hasClass('open')) {
    element.removeClass('open');
    element.find('.faq-content').removeClass('open');
    element.find('.faq-content').slideUp(300, "swing");
  } else {
    element.addClass('open');
    element.children('.faq-content').slideDown(300, "swing");
    element.siblings('.faq-item').children('.faq-content').slideUp(300, "swing");
    element.siblings('.faq-item').removeClass('open');
    element.siblings('.faq-item').find('.faq-title').removeClass('open');
    element.siblings('.taq-item').find('.faq-content').slideUp(300, "swing");
  }
});

// sidebar
$(".has-sub > a").on("click", function () {
  var element = $(this).parent("li");
  if (element.hasClass("active")) {
    element.removeClass("active");
    element.children("ul").slideUp(500);
  }
  else {
    element.siblings("li").removeClass('active');
    element.addClass("active");
    element.siblings("li").find("ul").slideUp(500);
    element.children('ul').slideDown(500);
  }
});

//sidebar Menu
$(document).on('click', '.sidebar-collapse-icon', function () {
  $('.page-container').toggleClass('show');
});

// Mobile Menu
$('.sidebar-mobile-menu').on('click', function () {
  $('.sidebar-main-menu').slideToggle();
});

// Panel options
$('.panel-options').on('click', function () {
  $('.panel-body').slideToggle();
});

// Panel options
$('.panel-options-form').on('click', function () {
  $('.panel-form-area').slideToggle();
});

// img-up
$('.imgUp').click(function () {
  upload();
});
function upload() {
  $(".upload").change(function () {
    readURL(this);
  });
}
function readURL(input) {
  if (input.files && input.files[0]) {
    var reader = new FileReader(); reader.onload = function (e) {
      var preview = $(input).parents('.profile-thumb-area').find('.image-preview');
      $(preview).css('background-image', 'url(' + e.target.result + ')');
      $(preview).hide();
      $(preview).fadeIn(650);
    }
    reader.readAsDataURL(input.files[0]);
  }
}

  

})(jQuery);