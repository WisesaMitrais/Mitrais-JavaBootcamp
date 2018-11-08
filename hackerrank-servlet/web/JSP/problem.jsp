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
                font-size: 20px;
                color: white;
            }

            nav {
                float: left;
                width: 15%;
                height: 485px;
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
                background-color: #EEEEEE;
                height: 485px;
            }

            section:after {
                content: "";
                display: table;
                clear: both;
            }
            
            .button2 {
                background-color: white; 
                color: black; 
                border: 2px solid #008CBA;
            }

            .button2:hover {
                background-color: #008CBA;
                color: white;
            }
            
            input[type=text], select {
                width: 20%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }
            
            input[type=submit] {
                width: 15%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
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
          <h3>HackerRank Servlet | Mitrais Java Bootcamp 2018</h3>
        </header>
        <section>
            <nav>
                <ul>
                  <li><a href="JSP/home.jsp">Home</a></li>
                  <li><a href="JSP/problem.jsp">HackerRank Problem</a></li>
                </ul>
            </nav>
            <article>
                <p><h3>Problem Data</h3><p>
                <form action="/category" method="GET">
                    <label for="pcat">Category: </label>
                    <select id="category" name="category">
                      <option value="0">All</option>
                      <option value="1">Algorithm</option>
                      <option value="2">Data Structure</option>
                    </select>
                    <label for="ptype">Type: </label>
                    <select id="type" name="type">
                      <option value="0">All</option>
                      <option value="101">Bit Manipulation</option>
                      <option value="102">Constructive Algorithms</option>
                      <option value="103">Dynamic Programming</option>
                      <option value="104">Game Theory</option>
                      <option value="105">Graph Theory</option>
                      <option value="106">Greedy</option>
                      <option value="107">Implementation</option>
                      <option value="108">NP Complete</option>
                      <option value="109">Recursion</option>
                      <option value="110">Search</option>
                      <option value="111">Sorting</option>
                      <option value="112">Strings</option>
                      <option value="113">Warmup</option>
                      <option value="201">Advanced</option>
                      <option value="202">Arrays</option>
                      <option value="203">Balanced Trees</option>
                      <option value="204">Disjoint Set</option>
                      <option value="205">Heap</option>
                      <option value="206">Linked Lists</option>
                      <option value="207">Queues</option>
                      <option value="208">Stacks</option>
                      <option value="209">Trees</option>
                      <option value="210">Trie</option>
                    </select>
                    &nbsp;&nbsp;<input type="submit" value="Show">
                </form>
                <table>
                    <tr>
                      <th>Company</th>
                      <th>Contact</th>
                      <th>Country</th>
                    </tr>
                    <tr>
                      <td>Alfreds Futterkiste</td>
                      <td>Maria Anders</td>
                      <td>Germany</td>
                    </tr>
                    <tr>
                      <td>Centro comercial Moctezuma</td>
                      <td>Francisco Chang</td>
                      <td>Mexico</td>
                    </tr>
                    <tr>
                      <td>Ernst Handel</td>
                      <td>Roland Mendel</td>
                      <td>Austria</td>
                    </tr>
                    <tr>
                      <td>Island Trading</td>
                      <td>Helen Bennett</td>
                      <td>UK</td>
                    </tr>
                    <tr>
                      <td>Laughing Bacchus Winecellars</td>
                      <td>Yoshi Tannamuri</td>
                      <td>Canada</td>
                    </tr>
                    <tr>
                      <td>Magazzini Alimentari Riuniti</td>
                      <td>Giovanni Rovelli</td>
                      <td>Italy</td>
                    </tr>
                </table>
            </article>
        </section>
    </body>
</html>
