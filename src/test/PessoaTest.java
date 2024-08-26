package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import business.Pessoa;

public class PessoaTest {
  @Test

  void testSetNome() {
    Pessoa pessoa= new Pessoa(); 
    pessoa.setNome("Luísa");
    assertEquals( "Luísa", pessoa.getNome());
  }
}
