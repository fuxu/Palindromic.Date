<?php
class Pal {
    function __construct($year) {
        $this->year = $year;
        $tmp = strrev($year);
        $this->month = intval(substr($tmp,0,2));
        $this->day = intval(substr($tmp,2,2));
    }
    function valid() {
        return checkdate($this->month, $this->day, $this->year);
    }
    function __toString() {
        return "".($this->year*10000+$this->month*100+$this->day);
    }
}

foreach(range(1280,2999) as $p) {
    $tmp = new Pal($p);
    if($tmp->valid()) {
        echo $tmp, "\t";
    }
}
