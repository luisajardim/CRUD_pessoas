package business;

import java.time.LocalDate;

public class Pessoa {
  private String nome;
  private LocalDate dataNascimento; 
  private Genero genero; 
  private float altura;
  private int peso; 
  private float renda;
  private String naturalidade; 
  private Hobby hobby; 
  private EstadoCivl estadoCivl;
  private Escolaridade escolaridade;
  private boolean feliz; 
  private Moradia moradia;

  public Pessoa (){

  }

  public Pessoa(String nome, LocalDate dataNascimento, Genero genero, float altura, int peso, float renda,
      String naturalidade, Hobby hobby, EstadoCivl estadoCivl, Escolaridade escolaridade, boolean feliz,
      Moradia moradia) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.genero = genero;
    this.altura = altura;
    this.peso = peso;
    this.renda = renda;
    this.naturalidade = naturalidade;
    this.hobby = hobby;
    this.estadoCivl = estadoCivl;
    this.escolaridade = escolaridade;
    this.feliz = feliz;
    this.moradia = moradia;
  }


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    if (nome != null
        && nome.matches(
            "[\\p{L} ]+")) { // \p{L} permite qualquer letra de qualquer idioma, incluindo acentos
      this.nome = nome;
    } 
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
  public Genero getGenero() {
    return genero;
  }
  public void setGenero(Genero genero) {
    this.genero = genero;
  }
  public float getAltura() {
    return altura;
  }
  public void setAltura(float altura) {
    this.altura = altura;
  }
  public int getPeso() {
    return peso;
  }
  public void setPeso(int peso) {
    this.peso = peso;
  }
  public float getRenda() {
    return renda;
  }
  public void setRenda(float renda) {
    this.renda = renda;
  }
  public String getNaturalidade() {
    return naturalidade;
  }
  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }
  public Hobby getHobby() {
    return hobby;
  }
  public void setHobby(Hobby hobby) {
    this.hobby = hobby;
  }
  public EstadoCivl getEstadoCivl() {
    return estadoCivl;
  }
  public void setEstadoCivl(EstadoCivl estadoCivl) {
    this.estadoCivl = estadoCivl;
  }
  public Escolaridade getEscolaridade() {
    return escolaridade;
  }
  public void setEscolaridade(Escolaridade escolaridade) {
    this.escolaridade = escolaridade;
  }
  public boolean isFeliz() {
    return feliz;
  }
  public void setFeliz(boolean feliz) {
    this.feliz = feliz;
  }
  public Moradia getMoradia() {
    return moradia;
  }
  public void setMoradia(Moradia moradia) {
    this.moradia = moradia;
  } 
  



}
