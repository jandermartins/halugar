/*

function Login(){
	var done = 0;
	var email = document.login.email.value;
	var senha = document.login.senha.value;


	if(email == "jandermartins@alu.ufc.br" && senha == "123"){		
		window.location = 'index.html';
		done = 1;
	}
	if(email == "daniel@alu.ufc.br" && senha == "123"){
		window.location = "index.html";
		done = 1;
	}else{
	
		for (var usuario in arrayDeUsuario) {
			if(usuario.email == email && usuario.senha == senha){
				window.location = "index.html";
				done = 1;
			}
		}
		if(done == 0){
			alert("Senha ou usuário inválidos");
		}
	}
}

var arrayDeUsuario = new Array();
	

function Usuario(nome, email, login, senha, telefone){
	this.nome = nome;
	this.email = email;
	this.login = login;
	this.senha = senha;
	this.telefone = telefone;
}

function CadastraUsuario(){
	var usuario = new Usuario(document.cadastro.nome.value, document.cadastro.email.value, document.cadastro.login.value, document.cadastro.senha.value, document.cadastro.telefone.value);	
	alert(usuario.nome);
	arrayDeUsuario.push(usuario);
}

function Casa(endereco, numero, cep, bairro, informacoes, preco, vagas, preferencia, dispomos){
	this.endereco = endereco;
	this.numero = numero;
	this.cep = cep;
	this.bairro = bairro;
	this.informacoes = informacoes;
	this.preco = preco;
	this.vagas = vagas;
	this.preferencia = preferencia;
	this.dispomos = dispomos;
}

var arrayDeCasa = new Array();

function CadastraCasa(){	
	var dispomos = new Array();
	
	var checks = document.getElementsByName("dispomos[]");

	for(var i = 0; i < checks.length; i++) {
		if(checks[i].checked) {
			dispomos.push(checks[i].value);
		}
	}

	var anuncio = new Casa(document.casa.endereco.value, document.casa.numero.value, document.casa.cep.value, document.casa.bairro.value,
	 document.casa.informacoes.value, document.casa.preco.value, document.casa.vagas.value, document.casa.preferencia.value, 
		dispomos);

	arrayDeCasa.push(anuncio);
}


function mostraCasas(){
	return arrayDeCasa;
}

*/