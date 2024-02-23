<%@ page contentType="text/html;charset=UTF-8" language="java" %> <html>
  <head>
    <title>Title</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      </div>
    </nav>
    <div class="container">
      <div class="row">
        <div class="card">
          <div class="card-header">
            <h2 class="text-center">Login Form</h2>
          </div>
          <div class="card-body">
            <form action="/login" method="POST" class="form-horizontal">
              <input type="text" name="username" id="username" placeholder="Name" required="required" />
              <input type="password" name="password" id="password" placeholder="Password" required="required" />
              <button type="submit" id="loginButton" class="btn btn-primary">Login</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>