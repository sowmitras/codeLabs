<html>
    <head>
        <title>Welcome</title>
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
                    <b><a class="navbar-brand" href="#">Sowmitras </a></b>
                </div>


                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">About</a></li>
                    <li><a href="#">Meet with us</a></li>
                    <li><a href="#">Testimonials</a></li>
                    <li><a href="#">contact</a></li>

                </ul>
            </div>
        </div>
    </nav>
    <div>

        <?php
        echo '<p class="custom"> Hello, world!</p>';
        echo '<p class="custom"> ';
        $number = 45;

        if (!$number == 45) {
            echo "surbhi";
        } else {
            echo "khare";
        }
        echo"<br>";

        echo '<p class="custom"> ';
        $age = 15;
        echo ($age < 18) ? 'Child' : 'Adult';

        echo"<br>";
        echo '<p class="custom"> ';
        $number = 2;
        switch ($number) {
            case 1:
                echo "your choice  is 1";
                break;
            case 2:
                echo "your choice  is 2 . <br>";

            case 3:
                echo "your choice  is 3 . <br>";

            default :
                echo "you are in default case";
                break;
        }
        echo"<br>";
        echo '<p class="custom">';
        $ages = array("Peter" => 22, "Clark" => 32, "John" => 28);
        print_r($ages);

        echo "<br>";
        echo'<p class="custom">';
        $color[RED] = "red";
        $color[BLUE] = "blue";
        print_r($color);
        //echo $color;

        echo "<br>";
        echo'<p class="custom">';
        //multidimensional array
        $contacts = array(
            array(
                "name" => "Peter Parker",
                "email" => "peterparker@mail.com",
            ),
            array(
                "name" => "Clark Kent",
                "email" => "clarkkent@mail.com",
            ),
            array(
                "name" => "Harry Potter",
                "email" => "harrypotter@mail.com",
            ),
            array(
                "name" => "Doremon",
                "email" => "doremon@gmail.com"
            )
        );
// Access nested value
        echo "Peter Parker's Email-id is: " . $contacts[0]["email"] . "<br>";
        echo "Clark Kent's Email-id is: " . $contacts[1]["email"] . "<br>";
        echo "Harry Potter's Email-id is: " . $contacts[2]["email"] . "<br>";
        echo "Doremon's Email-id is: " . $contacts[3]["email"] . "<br>";


        //indexing through array
        echo '<p class="custom">';
        $cities = array("Maheshwar", "Indore", "Pune");

        var_dump($cities) . "<br>";

        //array sort
        echo '<p class="custom">';
        $colors = array("Red", "Green", "Blue", "Yellow");
        sort($colors);
        print_r($colors) . "<br>";

        echo '<p class="custom">';
        $numbers = array(5, 2, 1, 9, 0, 5, 1);
        rsort($numbers);
        print_r($numbers) . "<br>";
        // var_dump($numbers);


        echo '<p class="custom">';
        $number = array("pink " => 3, "Red" => 10, "blue" => 110, "green" => 4);
        arsort($number);
        print_r($number) . "<br>";

        echo '<p class="custom">';
        $number = array("pink " => 3, "Red" => 10, "blue" => 110, "green" => 4);
        asort($number);
        print_r($number) . "<br>";

        echo '<p class="custom">';
        $age = array("Peter" => 20, "Harry" => 14, "John" => 45, "Clark" => 35);
        // Sorting array by value and print
        ksort($age);
        print_r($age) . "<br>";

        //while loop
        echo '<p class="custom">';
        $i = 1;

        while ($i <= 3) {
            $i++;
            echo "The number is " . $i . "<br>";
        }
        
        echo'<p class="custom">';
        $i=1;
        do{
    $i++;
    echo "The number is " . $i . "<br>";
}
while($i <= 3);


        
        ?>

</body>
</html>
