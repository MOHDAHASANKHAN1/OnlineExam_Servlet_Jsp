
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("Student")!=null){response.sendRedirect("Student");}%>
<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <meta http-equiv='X-UA-Compatible' content='ie=edge'>
    <title>ExamHub - Home</title>
    <link rel='shortcut icon' href='Images/Plogo.png' type='image/x-icon'>
    <link rel='apple-touch-icon' href='Images/Plogo.png'>    
    <link rel='preconnect' href='https://fonts.gstatic.com'>
    <link href='https://fonts.googleapis.com/css?family=Fredericka+the+Great|Josefin+Sans:400,400i,500,500i,600,600i,700,700i&display=swap' rel='stylesheet'>
    <link rel='stylesheet' href='Css/bootstrap.css'>
    <link rel='stylesheet' href='Css/odometer.css'>
    <link rel='stylesheet' href='Css/lightcase.css'>
    <link rel='stylesheet' href='Css/swiper.css'>
    <link rel='stylesheet' href='Css/line.css'>
    <link rel='stylesheet' href='Css/animate.css'>
    <link rel='stylesheet' href='Css/style.css'>
    <link rel='stylesheet' href='Css/basic.css' >
    <script src='https://kit.fontawesome.com/fdf05f1614.js' crossorigin='anonymous'></script>
    </head>
<body>
    <div id='fb-root'></div><script async defer crossorigin='anonymous' src='https://connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v4.0&appId=713047905830100&autoLogAppEvents=1'></script>
<div class='preloader'>
    <div class='loader book'>
        <figure class='page'></figure>
        <figure class='page'></figure>
        <figure class='page'></figure>
    </div>
</div>

<header class='header-section'>
    <div class='header'>
        <div class='header-bottom-area'>
            <div class='container'>
                <div class='header-menu-content'>
                    <nav class='navbar navbar-expand-lg p-0'>
                        <a class='site-logo site-title' href='/OnlineExam'><img src='Images/Plogo.png' alt='site-logo'></a>
                        
                        <button class='navbar-toggler ml-auto' type='button' data-toggle='collapse'
                            data-target='#navbarSupportedContent' aria-controls='navbarSupportedContent'
                            aria-expanded='false' aria-label='Toggle navigation'>
                            <span class='fas fa-bars'></span>
                        </button>
                        <div class='collapse navbar-collapse' id='navbarSupportedContent'>
                            <ul class='navbar-nav main-menu ml-auto mr-auto'>
                               
                                                                 <li><a href='/OnlineExam'>Home</a></li>
                                                                 <li><a href='/Courses'>Courses</a></li>
                                                               
                                <li><a href='About'>About</a></li>
                                <li><a href='frequently_asked_question'>Faq</a></li>
                                                                <li><a href='Contact'>Contact</a></li>
                                
                                
                             
                            </ul>
                            <div class='header-action'>
                                                                    <a href='Registartion' class='btn--base'><span>Register</span></a>
                                    <a href='Login' class='btn--base active'><span>Login</span></a>
                                                                                            </div>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</header>

 <section class='banner-section bg-overlay-white bg_img' data-background='Images/bg.jpg'>
    <div class='container'>
        <div class='row justify-content-center align-items-center mb-30-none'>
            <div class='col-xl-10 text-center mb-30'>
                <div class='banner-content'>
                    <h1 class='title text--base'>The Most Popular Online Exam Site</h1>
                    <h3 class='sub-title text-white'>We Will Open The World Of Knowledge For You !</h3>
                    <div class='banner-btn'>
                        <a href='Student' class='btn--base'>Get Started</a>
                        <a href='Login' class='btn--base active'>Learn More</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
 </section>
                        <!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Start Feature
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
<section class='feature-section'>
    <div class='container'>
        <div class='feature-area'>
            <div class='row'>
                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 p-0'>
                    <div class='feature-item'>
                        <h2 class='title text-white'>Get Support</h2>
                        <h3 class='sub-title text--base'>Support &amp; Service</h3>
                        <p class='text-white'>Our Support team are at your service. If need anything, request or support! We are available for You!</p>
                        
                    </div>
                </div>
                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 p-0'>
                    <div class='feature-item'>
                        <h2 class='title text-white'>Attend Your Examination</h2>
                        <h3 class='sub-title text--base'>Subject &amp; Resources</h3>
                        <p class='text-white'>Choose your subject and question bank with lots of questions. And get ready to give the exam. The random questions you you will get in your exams.</p>
                        
                    </div>
                </div>
                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 p-0'>
                    <div class='feature-item'>
                        <h2 class='title text-white'>Join Us</h2>
                        <h3 class='sub-title text--base'>Welcome to the ExamHub</h3>
                        <p class='text-white'>Join to our ExamHub community. Get the latest update and Our support team are always by your side and provide you with the best possible support!</p>
                        
                    </div>
                </div>
                                
            </div>
        </div>
    </div>
</section>
<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    End Feature
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->                    <section class='subject-section ptb-80'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-7 text-center'>
                <div class='section-header'>
                    <h2 class='section-title'>Our Most Popular Subjects</h2>
                    <span class='title-border'><i class='text--base h2 fa-solid fa-book-open-reader'></i></span>
                </div>
            </div>
        </div>
        <div class='row justify-content-center mb-30-none'>
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Operating Systems</h3>
                                <p>Operating System is a idea of how a device runs by system software, Operating Sy...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='Operating System is a idea of how a device runs by system software, Operating System is a idea of how a device runs by system software,Operating System is a idea of how a device runs by syste' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Historical Logic</h3>
                                <p>History is the scientific study of the past. Events occurring before the inventi...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='History is the scientific study of the past. Events occurring before the invention of writing ... and artistic dimensions, to theology and liturgy. This subject studies religions from all reg' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Mathematics logic</h3>
                                <p>Mathematical logic, also called formal logic, is a subfield of mathematics explo...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='Mathematical logic, also called formal logic, is a subfield of mathematics exploring the applications of formal logic to mathematics. ... Mathematical logic is often divided into the fields o' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Quiz</h3>
                                <p>This the systematic study of valid rules of inference, i.e. the relations that l...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='This the systematic study of valid rules of inference, i.e. the relations that lead to the acceptance of one proposition (the conclusion) on the basis of a set of other propositions (premises' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Basic General Knowledge</h3>
                                <p>General knowledge is information that has been accumulated over time through var...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='General knowledge is information that has been accumulated over time through various mediums. It excludes specialized learning that can only be obtained with extensive training and informatio' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>General Chemistry</h3>
                                <p>Chemistry is a branch of science that involves the study of the composition, str...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='Chemistry is a branch of science that involves the study of the composition, structure and properties of matter. Often known as the central science, it is a creative discipline chiefly concer' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>General Mathemetics</h3>
                                <p>Mathematics is the science that deals with the logic of shape, quantity and arra...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='Mathematics is the science that deals with the logic of shape, quantity and arrangement. Math is all around us, in everything we do. It is the building block for everything in our daily lives' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                        
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Higher Chemistry</h3>
                                <p>Business administration (also known as business management) is the administratio...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='Business administration (also known as business management) is the administration of a commercial enterprise. It includes all aspects of overseeing and supervising business operations.' href='Exam' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                                                <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                        <div class='subject-item section--bg'>
                            <div class='subject-content'>
                                <h3 class='title'>Programming Language</h3>
                                <p>PHP is a server side scripting language. that is used to develop Static websites...</p>
                                <div class='subject-btn'>
                                    <a data-toggle='tooltip' title='PHP is a server side scripting language. that is used to develop Static websites or Dynamic websites or Web applications.' href='php' class='custom-btn'>Exams <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                            
                       
        </div>
    </div>
</section>                    <section class='statistics-section ptb-80 bg-overlay-white bg_img' data-background='Images/bg1.jpg'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-7 text-center'>
                <div class='section-header white'>
                    <h2 class='section-title'>Our Achievements</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='statistics-area'>
            <div class='row justify-content-center mb-30-none'>
                                    <div class='col-xl-3 col-lg-6 col-md-6 col-sm-6 mb-30'>
                        <div class='statistics-item text-center'>
                            <div class='statistics-icon'>
                                <i class='fas fa-users'></i>                            </div>
                            <div class='statistics-content'>
                                <div class='odo-area'>
                                    <h3 class='odo-title odometer' data-odometer-final='5000+'>0</h3>
                                    <h3 class='title'>+</h3>
                                </div>
                            </div>
                            <p>Total Student</p>
                        </div>
                    </div>
                                    <div class='col-xl-3 col-lg-6 col-md-6 col-sm-6 mb-30'>
                        <div class='statistics-item text-center'>
                            <div class='statistics-icon'>
                                <i class='fas fa-graduation-cap'></i>                            </div>
                            <div class='statistics-content'>
                                <div class='odo-area'>
                                    <h3 class='odo-title odometer' data-odometer-final='2555+'>0</h3>
                                    <h3 class='title'>+</h3>
                                </div>
                            </div>
                            <p>Graduation Completed</p>
                        </div>
                    </div>
                                    <div class='col-xl-3 col-lg-6 col-md-6 col-sm-6 mb-30'>
                        <div class='statistics-item text-center'>
                            <div class='statistics-icon'>
                                <i class='fa-solid fa-earth-americas'></i>                            </div>
                            <div class='statistics-content'>
                                <div class='odo-area'>
                                    <h3 class='odo-title odometer' data-odometer-final='5,342+'>0</h3>
                                    <h3 class='title'>+</h3>
                                </div>
                            </div>
                            <p>Global Position</p>
                        </div>
                    </div>
                                    <div class='col-xl-3 col-lg-6 col-md-6 col-sm-6 mb-30'>
                        <div class='statistics-item text-center'>
                            <div class='statistics-icon'>
                                <i class='fas fa-book-open'></i>                            </div>
                            <div class='statistics-content'>
                                <div class='odo-area'>
                                    <h3 class='odo-title odometer' data-odometer-final='255+'>0</h3>
                                    <h3 class='title'>+</h3>
                                </div>
                            </div>
                            <p>Total Courses</p>
                        </div>
                    </div>
                            </div>
        </div>
    </div>
</section>                                        <section class='process-section ptb-80'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-7 text-center'>
                <div class='section-header'>
                    <h2 class='section-title'>Why ExamHub Is Best</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='process-area'>
                        <div class='process-item left'>
                    
                <div class='process-item-inner'>
                    <div class='process-content'>
                        <h3 class='title'>Choose Your Own Category</h3>
                        <p>Choose the exam category based on your subject. This helps you typically differentiate between subjects that are essential for studying a particular course and subjects.</p>
                        
                    </div>
                </div>
            </div>
                        <div class='process-item right'>
                    
                <div class='process-item-inner'>
                    <div class='process-content'>
                        <h3 class='title'>Select The Preferable Subject</h3>
                        <p>The aim of this to help you see things more clearly and get a good impression of the possible options, whether you have your heart set on a particular career path or not.</p>
                        
                    </div>
                </div>
            </div>
                        <div class='process-item left'>
                    
                <div class='process-item-inner'>
                    <div class='process-content'>
                        <h3 class='title'>Attend The Examination</h3>
                        <p>On a good thing, Here you can give an online exam that is required based on your preferable subject. This is too easy,  you just need to register and get ready for the exam.</p>
                        
                    </div>
                </div>
            </div>
                        <div class='process-item right'>
                    
                <div class='process-item-inner'>
                    <div class='process-content'>
                        <h3 class='title'>Get Your Result Fast</h3>
                        <p>After finished your examination, you can get your result very easily. Go to your dashboard and see the result of the examination you attend. Isn&#039;t so easy!</p>
                        
                    </div>
                </div>
            </div>
                       
        </div>
        <div class='process-area-inner'></div>
    </div>
</section>                    <section class='client-section ptb-80 section--bg bg-overlay-white bg_img' data-background='Images/bg2.jpg'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-lg-8 text-center'>
                <div class='section-header white'>
                    <h2 class='section-title'>What Client’s Say About Us</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='row justify-content-center'>
            <div class='col-xl-12'>
                <div class='client-slider'>
                    <div class='swiper-wrapper'>
                                                <div class='swiper-slide'>
                            <div class='client-item'>
                                <div class='client-content text-center'>
                                    <div class='client-quote-icon'>
                                        <i class='fa-solid fa-quote-left'></i>
                                    </div>
                                    <p>Very informative professional site, hope to have the opportunity to see more subject. Nice experience  from here and great work,  This such a honest, decent and reliable site</p>
                                    <div class='client-ratings'>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                    </div>
                                </div>
                                <div class='client-thumb-area'>
                                    <div class='client-thumb'>
                                        <img src='Images/s.jpg' alt='client'>
                                    </div>
                                    <div class='client-thumb-content'>
                                        <h3 class='title'>William Troyson</h3>
                                        <span class='sub-title'>Candidate</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                                                <div class='swiper-slide'>
                            <div class='client-item'>
                                <div class='client-content text-center'>
                                    <div class='client-quote-icon'>
                                        <i class='fa-solid fa-quote-left'></i>
                                    </div>
                                    <p>This such a honest, decent and reliable site i love it. This Site has a unique feel, thanks to the the maker. Thanks so much! You were an EXCELLENT!</p>
                                    <div class='client-ratings'>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                    </div>
                                </div>
                                <div class='client-thumb-area'>
                                    <div class='client-thumb'>
                                        <img src='Images/s1.jpg' alt='client'>
                                    </div>
                                    <div class='client-thumb-content'>
                                        <h3 class='title'>Max Polins</h3>
                                        <span class='sub-title'>Candidate</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                                                <div class='swiper-slide'>
                            <div class='client-item'>
                                <div class='client-content text-center'>
                                    <div class='client-quote-icon'>
                                        <i class='fa-solid fa-quote-left'></i>
                                    </div>
                                    <p>This page has a unique feel, thanks to the the maker. Thanks so much! You were an EXCELLENT! This such a honest, decent and reliable site i love it.</p>
                                    <div class='client-ratings'>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                        <i class='fa-solid fa-star text--base'></i>
                                    </div>
                                </div>
                                <div class='client-thumb-area'>
                                    <div class='client-thumb'>
                                        <img src='Images/s2.jpg' alt='client'>
                                    </div>
                                    <div class='client-thumb-content'>
                                        <h3 class='title'>Ben Kitrew</h3>
                                        <span class='sub-title'>Candidate</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                                               
                    </div>
                    <div class='swiper-pagination'></div>
                </div>
            </div>
        </div>
    </div>
</section>                    <section class='faq-section ptb-80'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-7 text-center'>
                <div class='section-header'>
                    <h2 class='section-title'>Frequently Asked Question</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='row justify-content-center mb-30-none'>
            <div class='col-xl-6 mb-30'>
                <div class='faq-thumb bg-overlay-white'>
                    <img src='Images/faq.jpg' alt='faq'>
                    <div class='faq-video'>
                        <a class='video-icon' data-rel='lightcase:myCollection' href='https://www.youtube.com/embed/shfeN07ZBJg'>
                            <i class='fa-solid fa-play'></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class='col-xl-6 mb-30'>
                <div class='faq-wrapper'>
                                        <div class='faq-item'>
                        <h3 class='faq-title'><span class='title'>How to register?</span><span
                                class='right-icon'></span></h3>
                        <div class='faq-content'>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                        </div>
                    </div>
                                        <div class='faq-item'>
                        <h3 class='faq-title'><span class='title'>How to attend the exam?</span><span
                                class='right-icon'></span></h3>
                        <div class='faq-content'>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                        </div>
                    </div>
                                        <div class='faq-item'>
                        <h3 class='faq-title'><span class='title'>How will I get my result?</span><span
                                class='right-icon'></span></h3>
                        <div class='faq-content'>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                        </div>
                    </div>
                                        <div class='faq-item'>
                        <h3 class='faq-title'><span class='title'>How may subjects are there?</span><span
                                class='right-icon'></span></h3>
                        <div class='faq-content'>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                        </div>
                    </div>
                                        <div class='faq-item'>
                        <h3 class='faq-title'><span class='title'>How I will get the support?</span><span
                                class='right-icon'></span></h3>
                        <div class='faq-content'>
                            <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. </p>
                        </div>
                    </div>
                                    </div>
            </div>
        </div>
    </div>
</section>                    <section class='call-to-action-section ptb-80 bg-overlay-white bg_img' data-background='Images/bg2.jpg'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-7 text-center'>
                <div class='section-header white'>
                    <h2 class='section-title'>Subscribe for newsletter</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='call-to-action-area'>
            <div class='row justify-content-center align-items-center'>
                <div class='col-lg-10'>
                    <div class='call-to-action-content'>
                        <form class='call-to-action-form'>
                            <div class='row justify-content-center align-items-center'>
                                <div class='col-lg-12'>
                                    <form class='subscribe-form'>
                                        <div class='form-group'>
                                            <input type='email' name='email' class='form-control email'  placeholder='Enter Your Valid Email Adress' required>
                                            <button type='button' class='submit-btn mt-0 subscribe'>subscribe</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

 
                        <section class='blog-section ptb-80'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-lg-7 text-center'>
                <div class='section-header'>
                    <h2 class='section-title'>Get Every Latest News Feed</h2>
                    <span class='title-border'><i class='fa-solid fa-book-open-reader text--base h2'></i></span>
                </div>
            </div>
        </div>
        <div class='row justify-content-center mb-30-none'>
                            <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                    <div class='blog-item'>
                        <div class='blog-thumb'>
                            <img src='Images/n.jpg' alt='blog'>
                        </div>
                        <div class='blog-content d-flex flex-wrap align-items-center'>
                            <span class='blog-date'>
                                <div class='date-icon'>
                                    <i class='fa-solid fa-calendar-days'></i>
                                </div>
                                <div class='date-content'>
                                    20 Mar
                                </div>
                            </span>
                            <div class='blog-content-details'>
                                <h3 class='title'><a href='Login'>Top Exam Preparation Tips</a>
                                </h3>
                                <div class='blog-btn'>
                                    <a href='Login' class='custom-btn'>Read More <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                            <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                    <div class='blog-item'>
                        <div class='blog-thumb'>
                            <img src='Images/n1.jpg' alt='blog'>
                        </div>
                        <div class='blog-content d-flex flex-wrap align-items-center'>
                            <span class='blog-date'>
                                <div class='date-icon'>
                                    <i class='fa-solid fa-calendar-days'></i>
                                </div>
                                <div class='date-content'>
                                    20 Mar
                                </div>
                            </span>
                            <div class='blog-content-details'>
                                <h3 class='title'><a href='Login'>15 Exam Preparation Tips: Key To Success</a>
                                </h3>
                                <div class='blog-btn'>
                                    <a href='Login' class='custom-btn'>Read More <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                            <div class='col-xl-4 col-lg-4 col-md-6 col-sm-6 mb-30'>
                    <div class='blog-item'>
                        <div class='blog-thumb'>
                            <img src='Images/n2.jpg' alt='blog'>
                        </div>
                        <div class='blog-content d-flex flex-wrap align-items-center'>
                            <span class='blog-date'>
                                <div class='date-icon'>
                                    <i class='fa-solid fa-calendar-days'></i>
                                </div>
                                <div class='date-content'>
                                    20 Mar
                                </div>
                            </span>
                            <div class='blog-content-details'>
                                <h3 class='title'><a href='Login'>Exam Preparation: Ten Study Tips</a>
                                </h3>
                                <div class='blog-btn'>
                                    <a href='Login' class='custom-btn'>Read More <i class='fa-solid fa-angles-right'></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                       
        </div>
    </div>
</section>            <a href='#0' class='scrollToTop'><i class='fa-solid fa-angles-up'></i></a>
<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    Start Footer
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
<footer class='footer-section pt-80'>
    <div class='container'>
        <div class='row justify-content-center'>
            <div class='col-xl-10 text-center'>
                <div class='footer-widget widget-menu'>
                    <div class='footer-logo mb-20'>
                        <a href='/OnlineExam' class='site-logo'><img src='Images/Plogo.png' alt='logo'></a>
                    </div>
                    <p>We Will Open The World Of Knowledge For You! This is the latest online examination system you will ever need! With our easy online exam site, you will set up your own engaging exams that fit any kind of difficulty level and be a learning expert.</p>
                    <div class='social-area'>
                        <ul class='footer-social'>
                                                          <li><a target='_blank' href='https://www.facebook.com/'><i class='fab fa-facebook-f'></i></a></li>
                                                          <li><a target='_blank' href='https://www.linkedin.com/'><i class='fab fa-linkedin-in'></i></a></li>
                                                          <li><a target='_blank' href='https://www.instagram.com/'><i class='fab fa-instagram'></i></a></li>
                                                          <li><a target='_blank' href='https://www.twitter.com/'><i class='fab fa-twitter'></i></a></li>
                                                    </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class='footer-bottom-area'>
        <div class='container'>
            <div class='row'>
                <div class='col-xl-12'>
                    <div class='copyright-area d-flex flex-wrap align-items-center justify-content-between mb-10-none'>
                        <div class='copyright mb-10'>
                            <p>Copyright © 2022 All Rights reserved by ExamHub</p>
                        </div>
                        <ul class='copyright-list mb-10'>
                                                            <li><a href='#'>Terms and Condition</a></li>
                           
                                                            <li><a href='#'>Privacy Policy</a></li>
                           
                                                    </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<!--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    End Footer
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->

<script src='Js/jquery.js'></script>

<script src='Js/bootstrap.js'></script>

<script src='Js/swiper.js'></script>

<script src='Js/viewport.js'></script>

<script src='Js/odometer.js'></script>

<script src='Js/lightcase.js'></script>

<script src='Js/wow.js'></script>

<script src='Js/main.js'></script>

</body>
</html>

