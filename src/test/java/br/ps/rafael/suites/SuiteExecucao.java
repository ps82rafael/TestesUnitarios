package br.ps.rafael.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ps.rafael.servicos.CalculoValorLocacaoTest;
import br.ps.rafael.servicos.LocacaoServiceTest;

@RunWith(Suite.class)
@SuiteClasses({
//	CalculadoraTest.class,
	CalculoValorLocacaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {
	//Remova se puder!
}
