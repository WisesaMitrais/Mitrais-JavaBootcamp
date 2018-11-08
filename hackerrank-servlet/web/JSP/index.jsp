<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HackerRank Servlet</title>
        <style>
            * {
                box-sizing: border-box;
            }

            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            header {
                background-color: #3AAFA9;
                padding: 30px;
                text-align: center;
                font-size: 30px;
                color: white;
            }

            nav {
                float: left;
                width: 15%;
                height: 383px;
                background: #DEF2F1;
                padding: 20px;
            }

            nav ul {
                list-style-type: none;
                padding: 0;
            }
            
            nav ul li {
                list-style-type: none;
                margin-bottom: 10px;
            }

            article {
                float: left;
                padding: 20px;
                width: 85%;
                background-color: #FEFFFF;
                height: 383px;
                text-align: center;
            }

            section:after {
                content: "";
                display: table;
                clear: both;
            }

            footer {
                background-color: #1A8F89;
                padding: 10px;
                text-align: center;
                font-size: 15px;
                color: white;
            }

            /* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
            @media (max-width: 600px) {
                nav, article {
                    width: 100%;
                    height: auto;
                }
            }
        </style>
    </head>
    <body>
        <header>
          <h3>HackerRank Servlet</h3>
        </header>
        <section>
          <nav>
            <ul>
              <li><a href="JSP/home.jsp">Home</a></li>
              <li><a href="JSP/problem.jsp">HackerRank Problem</a></li>
            </ul>
          </nav>
          <article>
            <p>This is simple simple application to implement java servlet and JSP in Mitrais Java Bootcamp 2018</p>
          </article>
        </section>
        <footer>
          <p>Mitrais Java Bootcamp 2018</p>
        </footer>
    </body>
</html>
