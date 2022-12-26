<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Complex Form</title>
  </head>
  <body class="" style="background: #e2e2e2;">
      <div class="container mt-4">
      
       <div class="row">
          <div class="col-md-6 offset-md-3" >
              <div class="card" >
              <div class="card-body">
               <h3 class="text-center">Complex Form</h3>
                <form action="handleform" method="post">
                
                <div class="alert alert-danger" role="alert">
                       
                       <form:errors path="student.*"  />
                       
                 </div>
                
                      <div class="from-group">
                        <label for="exampleInputEmail1">Your name</label> 
                        <input name="name"  type="text"  class="form-control" 
                         id="exampleInputEmail1" placeholder="Enter Name">
                         
                         <small id="exampleInputEmail1" class="form-text text-muted">
                              We'll never share your name with anyone else
                         </small>
                         
                      </div>
                      <br>
                      <div class="form-group">
                           <label for="exampleInputEmail1">Your id</label>
                           <input name="id" type="text" class="form-control" id="exampleInputEmail1"
                           aria-describedby="emailHelp" placeholder="Enter ID">
                      </div>
                      <br>
                      <div class="form-group">
                        <label for="exampleInputEmail1">Your DOB</label>
                        <input name="date" type="date" class="form-control"
                        id="exampleInputEmail1" placeholder="dd/mm/yy" aria-describeby="emailHelp" >
                      </div>
                      <br>
                      <div class="form-group" >
                             <label for="exampleFormControlSelect1">Select Courses</label>
                             <br>
                             <select name="courses" class="form-control"
                             id="exampleFormControlSelect1" multiple>
                             <option>Java</option>
                             <option>Python</option>
                             <option>C++</option>
                             <option>Django</option>
                             <option>Spring MVC FrameWork</option>
                             </select>
                       </div>
                       <br>
                       <div class="form-group">
                            <span class="mr-3">Select Gender </span>
                            <div class="form-check form-check-inline" >
                               <input class="form-check-input" type="radio" name="gender"
                                 id="inlineRadio1" value="male"> <label 
                                class="form-check-label" for="inlineRadio1">Male
                                 </label>
                            </div>
                            <div class="form-check form-check-inline" >
                               <input class="form-check-input" type="radio" name="gender"
                                 id="inlineRadio2" value="female"> <label 
                                class="form-check-label" for="inlineRadio2">Female
                                 </label>
                            </div>
                       </div>
                       <br>
                       <div class="form-group" >
                            <label for="">Select Type</label>
                            <select class="form-control" name="type">
                                <option value="oldstudent">Old Student</option>
                                <option value="normalstudent">Normal Student</option>
                            </select>
                       </div>
                       <br>
                       <div class="card">
                            <div class="card-body">
                            <p>Your Address</p>
                               <div class="form-group">
                                    <input type="text" class="form-control"
                                    name="address.street" placeholder="Enter Street">
                               </div>
                               <br>
                               <div class="form-group">
                                    <input type="text" class="form-control" 
                                     name="address.city"
                                    placeholder="Enter City">
                               </div>
                            
                            </div>
                       
                       </div>
                       
                       <br>
                       <div class="container text-center">
                              <button type="submit" class="btn btn-primary" >Submit</button>
                       </div>
                       
                </form>
              </div>
                
              </div>
          
          
           </div>
      
      
      </div>
     </div>
    

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>