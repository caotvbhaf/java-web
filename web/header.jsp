<%-- 
    Document   : header
    Created on : Oct 11, 2020, 8:39:04 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- Preloader Start Here -->
        <div id="preloader"></div>
        <!-- Preloader End Here -->
        <div id="wrapper" class="wrapper bg-ash">
            <!-- Header Menu Area Start Here -->
            <div class="navbar navbar-expand-md header-menu-one bg-light">
                <div class="nav-bar-header-one">
                    <div class="header-logo">
                        <a href="home.jsp">
                            <img src="img/logo.png" alt="logo">
                        </a>
                    </div>
                    <div class="toggle-button sidebar-toggle">
                        <button type="button" class="item-link">
                            <span class="btn-icon-wrap">
                                <span></span>
                                <span></span>
                                <span></span>
                            </span>
                        </button>
                    </div>
                </div>
                <div class="d-md-none mobile-nav-bar">
                    <button class="navbar-toggler pulse-animation" type="button" data-toggle="collapse" data-target="#mobile-navbar" aria-expanded="false">
                        <i class="far fa-arrow-alt-circle-down"></i>
                    </button>
                    <button type="button" class="navbar-toggler sidebar-toggle-mobile">
                        <i class="fas fa-bars"></i>
                    </button>
                </div>
                <div class="header-main-menu collapse navbar-collapse" id="mobile-navbar">
                    <ul class="navbar-nav">
                        <li class="navbar-item header-search-bar">
                            <div class="input-group stylish-input-group">
                                <span class="input-group-addon">
                                    <button type="submit">
                                        <span class="flaticon-search" aria-hidden="true"></span>
                                    </button>
                                </span>
                                <input type="text" class="form-control" placeholder="Find Something . . .">
                            </div>
                        </li>
                    </ul>
                    <ul class="navbar-nav">
                        <li class="navbar-item dropdown header-admin">
                            <a class="navbar-nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown"
                               aria-expanded="false">
                                <div class="admin-title">
                                    <h5 class="item-title">Stevne Zone</h5>
                                    <span>Admin</span>
                                </div>
                                <div class="admin-img">
                                    <img src="img/figure/admin.png" alt="Admin">
                                </div>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <div class="item-header">
                                    <h6 class="item-title">Steven Zone</h6>
                                </div>
                                <div class="item-content">
                                    <ul class="settings-list">
                                        <li><a href="#"><i class="flaticon-user"></i>My Profile</a></li>
                                        <li><a href="#"><i class="flaticon-list"></i>Task</a></li>
                                        <li><a href="#"><i class="flaticon-chat-comment-oval-speech-bubble-with-text-lines"></i>Message</a></li>
                                        <li><a href="#"><i class="flaticon-gear-loading"></i>Account Settings</a></li>
                                        <li><a href="Login.jsp"><i class="flaticon-turn-off"></i>Log Out</a></li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                        
                    </ul>
                </div>
            </div>
            <!-- Header Menu Area End Here -->
            <!-- Page Area Start Here -->
            <div class="dashboard-page-one">
                <!-- Sidebar Area Start Here -->
                <div class="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
                    <div class="mobile-sidebar-header d-md-none">
                        <div class="header-logo">
                            <a href="home.jsp"><img src="img/logo1.png" alt="logo"></a>
                        </div>
                    </div>
                    <div class="sidebar-menu-content">
                        <ul class="nav nav-sidebar-menu sidebar-toggle-view">
                            <li class="nav-item sidebar-nav-item">
                                <a href="#" class="nav-link"><i class="flaticon-dashboard"></i><span>Dashboard</span></a>
                                <ul class="nav sub-group-menu">
                                    <li class="nav-item">
                                        <a href="home.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Admin</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="manage-student.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Students</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="manage-teacher.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Teachers</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="index5.html" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Parents</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item sidebar-nav-item">
                                <a href="#" class="nav-link"><i class="flaticon-classmates"></i><span>Student</span></a>
                                <ul class="nav sub-group-menu">
                                    <li class="nav-item">
                                        <a href="all-student.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All
                                            Student</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="student-details.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Student Details</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="admit-form.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Admission Form</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="student-promotion.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Student Promotion</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item sidebar-nav-item">
                                <a href="#" class="nav-link"><i
                                        class="flaticon-multiple-users-silhouette"></i><span>Teacher</span></a>
                                <ul class="nav sub-group-menu">
                                    <li class="nav-item">
                                        <a href="all-teacher.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All
                                            Teacher</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="teacher-details.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Teacher Details</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="add-teacher.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Add
                                            Teacher</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="teacher-payment.jsp" class="nav-link"><i
                                                class="fas fa-angle-right"></i>Payment</a>
                                    </li>
                                </ul>
                            </li>
                            
                         
                            <li class="nav-item sidebar-nav-item">
                                <a href="#" class="nav-link"><i
                                        class="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i><span>Class</span></a>
                                <ul class="nav sub-group-menu">
                                    <li class="nav-item">
                                        <a href="all-class.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All
                                            Classes</a>
                                    </li>
                                    <li class="nav-item">
                                        <a href="add-class.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Add New
                                            Class</a>
                                    </li>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="all-subject.jsp" class="nav-link"><i
                                        class="flaticon-open-book"></i><span>Subject</span></a>
                            </li>
                            
                            
                            <li class="nav-item">
                                <a href="account-settings.jsp" class="nav-link"><i
                                        class="flaticon-settings"></i><span>Account</span></a>
                            </li>
                        </ul>
                    </div>
                </div>
                <!-- Sidebar Area End Here -->
                </body>
                </html>
