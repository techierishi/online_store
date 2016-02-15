<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<% String context = request.getContextPath(); %>
<html lang="en">
    <jsp:include page="commons/head.jsp"></jsp:include>
        <body>
        <jsp:include page="commons/topbar.jsp"></jsp:include>
        <jsp:include page="commons/navbar.jsp"></jsp:include>

            <div id="all">

                <div id="content">
                    <div class="container">

                        <div class="col-md-12">

                            <ul class="breadcrumb">
                                <li><a href="#">Home</a>
                                </li>
                                <li>New account / Sign in</li>
                            </ul>

                        </div>

                        <div class="col-md-6">
                            <div class="box">
                                <h1>New account</h1>

                                <p class="lead">Not our registered customer yet?</p>
                                <p>With registration with us new world of fashion, fantastic discounts and much more opens to you! The whole process will not take you more than a minute!</p>
                                <p class="text-muted">If you have any questions, please feel free to <a href="contact.html">contact us</a>, our customer service center is working for you 24/7.</p>

                                <hr>

                                <form action="<%=context %>/user_save"  method="post">

                                <table    border="1">

                                    <tr><td>First Name<td> <input type="text" name="user.firstName"></td></tr>
                                    <tr><td>Last Name<td> <input type="text" name="user.lastName"></td></tr>
                                    <tr><td>Email<td> <input type="password" name="user.email"></td></tr>
                                    <tr><td>User Id<td> <input type="text" name="user.userId"></td></tr>
                                    <tr><td>Password<td> <input type="text" name="user.password"></td></tr>
                                    
                                   
                                    <tr>

                                        <td colspan="2" align="center">

                                            <input type="submit" value="Register">

                                            <input type="reset" value="Cancel">

                                        </td>

                                </table>




                            </form>
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="box">
                            <s:form action="addUser">
                                <s:textfield name="name" label="User Name" />
                                <s:password name="password" label="Password" />
                                <s:radio name="gender" label="Gender" list="{'Male','Female'}" />
                                <s:select name="country" list="{'India','USA','UK'}" headerKey=""
                                          headerValue="Country" label="Select a country" />
                                <s:textarea name="aboutYou" label="About You" />
                                <s:checkbox name="mailingList"
                                            label="Would you like to join our mailing list?" />
                                <s:submit />
                            </s:form>

                            <s:if test="userList.size() > 0">
                                <div class="content">
                                    <table class="userTable" cellpadding="5px">
                                        <tr class="even">
                                            <th>Name</th>
                                            <th>Gender</th>
                                            <th>Country</th>
                                            <th>About You</th>
                                            <th>Mailing List</th>
                                        </tr>
                                        <s:iterator value="userList" status="userStatus">
                                            <tr
                                                class="<s:if test="#userStatus.odd == true ">odd</s:if><s:else>even</s:else>">
                                                <td><s:property value="email" /></td>
                                                <td><s:property value="gender" /></td>
                                                <td><s:property value="country" /></td>
                                                <td><s:property value="aboutYou" /></td>
                                                <td><s:property value="mailingList" /></td>
                                            </tr>
                                        </s:iterator>
                                    </table>
                                </div>
                            </s:if>
                        </div>
                    </div>


                </div>
                <!-- /.container -->
            </div>
            <!-- /#content -->
        </div>
        <!-- /#all -->
        <jsp:include page="commons/footer.jsp"></jsp:include>
    </body>

</html>