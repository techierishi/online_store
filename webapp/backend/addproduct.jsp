<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <jsp:include page="commons/head.jsp"></jsp:include>

        <body class="hold-transition skin-blue sidebar-mini">
            <div class="wrapper">

            <jsp:include page="commons/header.jsp"></jsp:include>

                <!-- Left side column. contains the logo and sidebar -->
            <jsp:include page="commons/sidebar.jsp"></jsp:include>
                <!-- Content Wrapper. Contains page content -->
                <div class="content-wrapper">
                    <!-- Content Header (Page header) -->
                    <section class="content-header">
                        <h1>
                            Product
                            <small>Add Product</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                            <li class="active">Add Product</li>
                        </ol>
                    </section>

                    <!-- Main content -->
                    <section class="content">
                        <div class="row">
                            <!-- left column -->
                            <div class="col-md-6">
                                <!-- general form elements -->
                                <div class="box box-primary">
                                    <div class="box-header with-border">
                                        <h3 class="box-title">Quick Example</h3>
                                    </div><!-- /.box-header -->
                                    <!-- form start -->
                                    <form role="form">
                                        <div class="box-body">
                                            <div class="form-group">
                                                <label for="exampleInputEmail1">Email address</label>
                                                <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">Password</label>
                                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                            </div>
                                            <div class="form-group">
                                                <label for="exampleInputFile">File input</label>
                                                <input type="file" id="exampleInputFile">
                                                <p class="help-block">Example block-level help text here.</p>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox"> Check me out
                                                </label>
                                            </div>
                                        </div><!-- /.box-body -->

                                        <div class="box-footer">
                                            <button type="submit" class="btn btn-primary">Submit</button>
                                        </div>
                                    </form>
                                </div><!-- /.box -->

                            </div><!--/.col (left) -->
                            
                        </div>   <!-- /.row -->
                    </section><!-- /.content -->

                </div><!-- /.content-wrapper -->

            <jsp:include page="commons/footer.jsp"></jsp:include>


                <!-- Control Sidebar -->
            <jsp:include page="commons/common_sidebar.jsp" ></jsp:include>
                <!-- Add the sidebar's background. This div must be placed
                     immediately after the control sidebar -->
                <div class="control-sidebar-bg"></div>
            </div><!-- ./wrapper -->

        <jsp:include page="commons/script.jsp" ></jsp:include>
    </body>
</html>
