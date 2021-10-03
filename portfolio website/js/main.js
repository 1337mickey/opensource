function validform(){                        /*call of function from contact page*/

    var name = document.contact.name;
    var email = document.contact.email;
    var phone = document.contact.phone;
    var subject = document.contact.subject;        /*fetching of data*/
    var message = document.contact.message;
    var conditions = document.contact.conditions;

    if(name.value == ""){                              /*null value condition*/
        name.nextElementSibling.style.display = "block";
        name.style.border = "1px solid #f00";
        return false                                      /*logic*/
    }
    else{
        name.nextElementSibling.style.display = "none";
        name.style.border = "1px solid transparent";
    }

    if( email.value == ""){                                  /*null value condition*/
        email.nextElementSibling.style.display = "block";
        email.style.border = "1px solid #f00";
        return false                                          /*logic*/
    }
    else{
        email.nextElementSibling.style.display = "none";
        email.style.border = "1px solid transparent";
    }

    if(phone.value == ""){                                    /*null value condition*/
        phone.nextElementSibling.style.display = "block";
        phone.style.border = "1px solid #f00";
        return false                                            /*logic*/
    }
    else{
        phone.nextElementSibling.style.display = "none";
        phone.style.border = "1px solid transparent";
    }

    if(subject.value == ""){                                     /*null value condition*/
        subject.nextElementSibling.style.display = "block";
        subject.style.border = "1px solid #f00";
        return false                                              /*logic*/
    }
    else{
        subject.nextElementSibling.style.display = "none";
        subject.style.border = "1px solid transparent";
    }

    if(message.value == ""){                                        /*null value condition*/
        message.nextElementSibling.style.display = "block";
        message.style.border = "1px solid #f00";
        return false                                            /*logic*/
    }
    else{
        message.nextElementSibling.style.display = "none";
        message.style.border = "1px solid transparent";
    }

    if(conditions.checked == false){                                     /*null value condition*/
        conditions.nextElementSibling.style.display = "block";
        conditions.style.border = "1px solid #f00";
        return false                                                                 /*logic*/
    }
    else{
        conditions.nextElementSibling.style.display = "none";
        conditions.style.border = "1px solid transparent";
    }

    if (conditions.checked == true){
        alert("form submitted");                   /*if all satisfied this popus saying for submitted or returns to previous value*/
    }
}