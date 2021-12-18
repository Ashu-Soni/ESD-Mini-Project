let login_form = document.getElementById('login-validation');

login_form.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    document.getElementById("submit-button").style.display = "none";
    document.getElementById("spinner-button").style.display = "block";

    let response = await fetch('api/users/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json;charset=utf-8'
        },
        body: JSON.stringify({
            username: document.getElementById('username').value,
            password: document.getElementById('password').value,
        })
    });

    try{
        let result = await response.json();
        document.getElementById("submit-button").style.display = "block";
        document.getElementById("spinner-button").style.display = "none";
        console.log(result);
        sessionStorage.setItem('id', result["emp_id"]);
        console.log(sessionStorage.getItem('id'));
        window.location.href = `http://localhost:8085/project_war/Home.html`;
    }catch (err){
        document.getElementById("submit-button").style.display = "block";
        document.getElementById("spinner-button").style.display = "none";
        document.getElementById("login-alert").style.display = "block";
    }
});