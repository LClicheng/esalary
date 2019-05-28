<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Lowin</title>
	<link rel="stylesheet" href="auth.css">
</head>

<body>
	<div class="lowin">
		<div class="lowin-brand">
			<a href="index.jsp" ><img src="kodinger.jpg" alt="logo"></a>
		</div>
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form action="login.do" method="post">
						<p>Sign in to continue</p>
						<div class="lowin-group">
							<label>UserId <a href="#" class="login-back-link">Sign in?</a></label>
							<input type="id" autocomplete="" name="id" class="lowin-input">
						</div>
						<div class="lowin-group password-group">
							<label>Password <a href="#" class="forgot-link">Forgot Password?</a></label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<input class="lowin-btn login-btn" type="submit" value="Sign In">
							
						

						<div class="text-foot">
							Don't have an account? <a href="" class="register-link">Register</a>
						</div>
					</form>
				</div>
			</div>

			<div class="lowin-box lowin-register">
				<div class="lowin-box-inner">
					<form>
						<p>Let's create your account</p>
						<div class="lowin-group">
							<label>Name</label>
							<input type="text" name="name" autocomplete="name" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label>Email</label>
							<input type="email" autocomplete="email" name="email" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label>Password</label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn">
							Sign Up
						</button>

						<div class="text-foot">
							Already have an account? <a href="" class="login-link">Login</a>
						</div>
					</form>
				</div>
			</div>
		</div>
	
		<footer class="lowin-footer">
			Design By @LC. More Templates <a href="" target="_blank" title="">Mr.Lee</a> - Collect from <a href="" title="" target="_blank"></a>
		</footer>
	</div>

	<script src="auth.js"></script>
	<script>
		Auth.init({
			login_url: 'login.do',
			forgot_url: '#forgot'
		});
	</script>
</body>
</html>