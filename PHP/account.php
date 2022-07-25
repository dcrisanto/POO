<?php
class Account {
    public $id;
    public $name;
    public $phone;
    public $document;
    public $email;
    public $password;

    public function __construct($name, $document) {
        $this->name = $name;
        $this->document = $document;
    }
}

?>