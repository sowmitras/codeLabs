<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>SurbhiCodeLabz</title>
        <link rel="stylesheet" href="css/bootstrap.css"  type="text/css">
        <link rel="stylesheet" href="css/style.css"  type="text/css">
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Brand</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Link</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>
        <div >
            <?php
            // echo print
            //check some link how to use <> is php to deco 
            //echo print for font
            //variable declairation
            echo '<p class="custom"> Hello, world!</p>';

            $color = "blue";

            echo '<p class="custom">The color of the sky is ' . $color . "<br>";
            echo 'The color of the sky is ' . $Color . "<br>";
            echo 'The color of the sky is </p>' . $COLOR;

            // Get the type of a variable
            echo '<p class="custom"> ';
            $color = "blue";
            echo gettype($color) . "<br>";
            echo GETTYPE($color);
            echo '</p>';



            //display variable value
            echo '<p class="custom"> ';
            $text = "welcome";
            $number = 50;
            echo $text . "<br>";
            echo $number . "<br>";




            //display variables using array

            echo '<p class="custom"> ';
            $name = array("surbhi", "khare", "maheshwar");

            echo $name[0] . ", " . $name[1] . " ," . $name[2];


            //variable declairation
            echo '<p class="custom"> ';
            $a = 123;
            var_dump($a);
            echo "<br>";

            $b = -123; // a negative number
            var_dump($b);
            echo "<br>";

            $c = 0x1B; // hexadecimal number
            var_dump($c);
            echo "<br>";

            $d = 0123; // octal number
            var_dump($d);
            echo "<br>";


            echo '<p class="custom"> ';
            $e = 'Hello world!';
            echo $e;
            echo "<br>";

            $f = "Hello world!";
            echo $f;
            echo "<br>";

            $g = 'Stay here, I\'ll be back.';
            echo $g;
            echo"<br>";

            echo '<p class="custom"> ';
            $h = 1.234;
            var_dump($h);
            echo "<br>";

            $i = 10.2e3;
            var_dump($i);
            echo "<br>";

            $j = 4E-10;
            var_dump($j);
            echo "<br>";

            echo '<p class="custom"> ';

            $show_error = true;
            var_dump($show_error);
            echo"<br>";

            echo '<p class="custom"> ';

            $colors = array("Red", "Green", "Blue");
            var_dump($colors);
            ;

            $color_codes = array(
                "Red" => "#ff0000",
                "Green" => "#00ff00",
                "Blue" => "#0000ff"
            );
            var_dump($color_codes);
            echo"<br>";
            echo"<br>";

            //method calling

            echo '<p class="custom"> ';

            function writeMsg() {
                echo "surbhi!";
            }

            writeMsg();

            //parameterized method
            echo '<p class="custom"> ';

            function familyName($fname) {
                echo "$fname.<br>";
            }

            familyName("Jani");
            familyName("Hege");
            familyName("Stale");
            familyName("Kai Jim");
            familyName("Borge");
            //Null value
            echo '<p class="custom"> ';
            $a1 = NULL;
            var_dump($a1);
            echo "<br>";

            $b11 = "Hello World!";
            $b11 = NULL;
            var_dump($b11);

            //string operation

            $my_str = 'World';
            echo '<p class="custom">Hello, $my_str!<br>';      // Displays: Hello World!
            echo 'Hello, $my_str!<br>';      // Displays: Hello, $my_str!
            echo 'Hello\tWorld!<br>'; // Displays: Hello\tWorld!
            echo 'Hello\tWorld!<br>'; // Displays: Hello   World!
            echo 'I\'ll be back</p>';


            //count length of string
            echo '<p class="custom"> ';
            echo strlen("Welcome to Tutorial Republic");



            //word count of string
            echo '<p class="custom"> ';
            $st = 'The quick brown fox jumps over the lazy dog.';
            echo str_word_count($st);
            echo"<br>";

            //define constant
            
            echo'<nav aria-label="...">
  <ul class="pager">
    
    <li class="next"><a href="test2.php">Next <span aria-hidden="true">&rarr;</span></a></li>
  </ul>
</nav><br><br>';
            
            
            
            
            echo '<nav class="navbar navbar-default navbar-fixed-bottom">
  <div class="container">';
            echo '<p class="center.a"> ';
            define(SITE_URL, "Thank you for visiting - ");
            define(SOWMITRAS, "Sowmitras CodeLabz");
            echo SITE_URL . '<a href="http://www.sowmitrastechnosoft.com/" target="_blank">' . SOWMITRAS . '</a>';
            
            echo'</div></div>'?>
        </div>


    </div

</body>
</html>
