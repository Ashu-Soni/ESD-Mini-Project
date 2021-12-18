async function loginFunction() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;

    let obj = {
        user_id:0,
        department:"",
        name:"",
        email:"",
        password:password,
        username:username,
        salary:0
    };

    console.log(obj)

    let response = await fetch('api/users/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify(obj)
    });

    try {
        let result = await response.json();
        // document.getElementById("submit-button").style.display = "block";
        // document.getElementById("spinner-button").style.display = "none";
        console.log(result);
        // sessionStorage.setItem('id', result["emp_id"]);
        // console.log(sessionStorage.getItem('id'));
        // location.href = "Home.html";
    } catch (err) {
        // document.getElementById("submit-button").style.display = "block";
        // document.getElementById("spinner-button").style.display = "none";
        // document.getElementById("login-alert").style.display = "block";
        console.error("Not valid")
    }
}

async function getSalaryInfo() {
    console.log(100)

    let response = await fetch('api/users/get_salary_info/'+100, {
        method: 'GET'
    });

    try {
        let result = await response.json();
        // document.getElementById("submit-button").style.display = "block";
        // document.getElementById("spinner-button").style.display = "none";
        console.log(result);
        // sessionStorage.setItem('id', result["emp_id"]);
        // console.log(sessionStorage.getItem('id'));
        // location.href = "Home.html";
    } catch (err) {
        // document.getElementById("submit-button").style.display = "block";
        // document.getElementById("spinner-button").style.display = "none";
        // document.getElementById("login-alert").style.display = "block";
        console.error("Not valid")
    }
}