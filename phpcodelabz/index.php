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
    </head>
    <body>
        <div align="center">

            <?php
            // echo print

            echo 'Hello World!';
            echo"<br>";
            //check some link how to use <> is php to deco 
            //echo print for font
            echo "<h1> Hello, world!</h1>";

            //variable declairation
            $color = "blue";

            echo "The color of the sky is " . $color . "<br>";
            echo "The color of the sky is " . $Color . "<br>";
            echo "The color of the sky is " . $COLOR . "<br>";
            echo"<br>";


            // Get the type of a variable
            $color = "blue";
            echo gettype($color) . "<br>";
            echo GETTYPE($color) . "<br>";
            echo"<br>";


            //display variable value
            $text = "welcome";
            $number = 50;
            echo $text . "<br>";
            echo $number . "<br>";
            echo"<br>";

            //define constant
            define("SITE_URL", "http://www.tutorialrepublic.com/");
            echo 'Thank you for visiting - ' . SITE_URL;

            //display variables using array
            $name = array("surbhi", "khare", "maheshwar");
            echo "<br>";
            echo $name[0] . ", " . $name[1] . " ," . $name[2] . "<br>";
            echo"<br>";

            //variable declairation
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
            echo"<br>";

            $e = 'Hello world!';
            echo $e;
            echo "<br>";

            $f = "Hello world!";
            echo $f;
            echo "<br>";

            $g = 'Stay here, I\'ll be back.';
            echo $g;
            echo"<br>";

            $h = 1.234;
            var_dump($h);
            echo "<br>";

            $i = 10.2e3;
            var_dump($i);
            echo "<br>";

            $j = 4E-10;
            var_dump($j);
            echo "<br>";

            $show_error = true;
            var_dump($show_error);
            echo"<br>";
            echo"<br>";

            $colors = array("Red", "Green", "Blue");
            var_dump($colors);
            echo "<br>";


            $color_codes = array(
                "Red" => "#ff0000",
                "Green" => "#00ff00",
                "Blue" => "#0000ff"
            );
            var_dump($color_codes);
            echo"<br>";
            echo"<br>";

            //method calling

            function writeMsg() {
                echo "surbhi!";
            }

            writeMsg();
            echo"<br>";
            echo"<br>";

            //parameterized method

            function familyName($fname) {
                echo "$fname.<br>";
            }

            familyName("Jani");
            familyName("Hege");
            familyName("Stale");
            familyName("Kai Jim");
            familyName("Borge");
            echo"<br>";

            //Null value

            $a1 = NULL;
            var_dump($a1);
            echo "<br>";

            $b11 = "Hello World!";
            $b11 = NULL;
            var_dump($b11);
            echo"<br>";
            echo"<br>";

            //string operation

            $my_str = 'World';
            echo "Hello, $my_str!<br>";      // Displays: Hello World!
            echo 'Hello, $my_str!<br>';      // Displays: Hello, $my_str!

            echo '<pre>Hello\tWorld!</pre>'; // Displays: Hello\tWorld!
            echo "<pre>Hello\tWorld!</pre>"; // Displays: Hello   World!
            echo 'I\'ll be back';
            echo"<br>";
            echo"<br>";

            //count length of string
            $str = "Welcome to Tutorial Republic";
            echo len($str);

            //word count of string
            $st = 'The quick brown fox jumps over the lazy dog.';
            echo str_word_count($st);
            ?>
        </div>
    </body>
</html>
