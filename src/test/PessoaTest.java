package test;

import static org.junit.Assert.assertEquals;

import business.Pessoa;
import org.junit.jupiter.api.Test;

public class PessoaTest {
  @Test
  void testSetNome() {
    Pessoa pessoa= new Pessoa(); 
    pessoa.setNome("Luísa");
    assertEquals( "Luísa", pessoa.getNome());
  }

  @Test 
  void testSetNomeInvalido(){
    Pessoa pessoa= new Pessoa();
    pessoa.setNome("12345");
    assertEquals(null, pessoa.getNome());
  }

}

