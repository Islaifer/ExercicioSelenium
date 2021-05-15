package teste.selenium;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teste {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() throws MalformedURLException {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void REQ01CT01cadastrolivrocomsucesso() {
		driver.get("https://ts-scel.herokuapp.com/login");
		driver.manage().window().setSize(new Dimension(1382, 744));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("jose");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button")).click();
		espera();
		driver.findElement(By.linkText("Livros")).click();
		driver.findElement(By.id("isbn")).click();
		driver.findElement(By.id("isbn")).sendKeys("6666");
		driver.findElement(By.id("autor")).click();
		driver.findElement(By.id("autor")).sendKeys("Sir Astora");
		driver.findElement(By.id("titulo")).click();
		driver.findElement(By.id("titulo")).sendKeys("O manual dos mortos");
		driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		espera();
		driver.findElement(By.linkText("Excluir")).click();
	}  
	
	  @Test
	  public void REQ02CT01ISBNInvalido() {
	    driver.get("https://ts-scel.herokuapp.com/login");
	    driver.manage().window().setSize(new Dimension(550, 693));
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    driver.findElement(By.linkText("Livros")).click();
	    driver.findElement(By.id("isbn")).click();
	    driver.findElement(By.id("isbn")).sendKeys("123");
	    driver.findElement(By.id("autor")).click();
	    driver.findElement(By.id("autor")).sendKeys("Sir Astora");
	    driver.findElement(By.id("titulo")).click();
	    driver.findElement(By.id("titulo")).sendKeys("Manual dos mortos");
	    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
	  }
	  
	  @Test
	  public void REQ03CT01CadastroAlunoSucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(550, 693));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("0666");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("Sir Astora");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("aaaa@aaaaa.com");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03687010");
		    driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-8:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.close();
	}
	  
	  @Test
	  public void REQ04CT01RAInvalido() {
		driver.get("https://ts-scel.herokuapp.com/login");
		driver.manage().window().setSize(new Dimension(550, 693));
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("jose");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("button")).click();
	    driver.findElement(By.linkText("Alunos")).click();
	    driver.findElement(By.id("ra")).click();
	    driver.findElement(By.id("ra")).sendKeys("341");
	    driver.findElement(By.id("nome")).click();
	    driver.findElement(By.id("nome")).sendKeys("Sir Astora");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("aaaa@aaaaa.com");
	    driver.findElement(By.id("cep")).click();
	    driver.findElement(By.id("cep")).sendKeys("03687010");
	    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
	    driver.close();
	  }
	  
	  @Test
	  public void REQ05CT01CadastroAlunoSucesso() {
		    driver.get("https://ts-scel.herokuapp.com/login");
		    driver.manage().window().setSize(new Dimension(550, 693));
		    driver.findElement(By.name("username")).click();
		    driver.findElement(By.name("username")).sendKeys("jose");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("123");
		    driver.findElement(By.cssSelector("button")).click();
		    driver.findElement(By.linkText("Alunos")).click();
		    driver.findElement(By.id("ra")).click();
		    driver.findElement(By.id("ra")).sendKeys("0666");
		    driver.findElement(By.id("nome")).click();
		    driver.findElement(By.id("nome")).sendKeys("Sir Astora");
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys("aaaa@aaaaa.com");
		    driver.findElement(By.id("cep")).click();
		    driver.findElement(By.id("cep")).sendKeys("03687010");
		    driver.findElement(By.cssSelector(".row:nth-child(2) > .col-md-8:nth-child(1)")).click();
		    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
		    driver.close();
	}
	  
	  @Test
	  public void REQ06CT01EmprestimoComSucesso() {
	    driver.get("https://ts-scel.herokuapp.com/login");
	    driver.manage().window().setSize(new Dimension(550, 693));
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    driver.findElement(By.linkText("Empréstimo")).click();
	    driver.findElement(By.id("isbn")).click();
	    driver.findElement(By.id("isbn")).sendKeys("5987");
	    driver.findElement(By.id("ra")).click();
	    driver.findElement(By.id("ra")).sendKeys("0666");
	    driver.findElement(By.cssSelector(".row:nth-child(4)")).click();
	    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
	    driver.findElement(By.cssSelector(".container-fluid")).click();
	    driver.close();
	  }
	  
	  @Test
	  public void REQ07CT01RegistroDeEmprestimo() {
	    driver.get("https://ts-scel.herokuapp.com/");
	    driver.manage().window().setSize(new Dimension(550, 693));
	    driver.findElement(By.linkText("Empréstimo")).click();
	    driver.findElement(By.id("isbn")).click();
	    driver.findElement(By.id("isbn")).sendKeys("5987");
	    driver.findElement(By.id("ra")).click();
	    driver.findElement(By.id("ra")).sendKeys("0666");
	    vars.put("window_handles", driver.getWindowHandles());
	    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
	    vars.put("win376", waitForWindow(2000));
	    vars.put("root", driver.getWindowHandle());
	    driver.switchTo().window(vars.get("win376").toString());
	    driver.findElement(By.linkText("Devolver")).click();
	    driver.switchTo().window(vars.get("root").toString());
	    driver.close();
	    driver.switchTo().window(vars.get("win376").toString());
	    driver.close();
	  }
	  
	  @Test
	  public void REQ08CT01RejeitarAcessoNaoAutorizado() {
	    driver.get("https://ts-scel.herokuapp.com/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    driver.findElement(By.linkText("Logout")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("ttttt");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    driver.close();
	  }
	  
	  @Test
	  public void REQ09CT01RejeitarAcessoNaoAutorizado() {
	    driver.get("https://ts-scel.herokuapp.com/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    driver.findElement(By.linkText("Logout")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("jose");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("123");
	    driver.findElement(By.cssSelector("button")).click();
	    driver.close();
	  }
	  
	  @Test
	  public void REQ10CT01RejeitarAcessoNaoAutorizado() {
	    driver.get("https://ts-scel.herokuapp.com/");
	    driver.manage().window().setSize(new Dimension(1382, 744));
	    driver.findElement(By.linkText("Logout")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("maria");
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).sendKeys("456");
	    driver.findElement(By.cssSelector("button")).click();
	    driver.close();
	  }
	  
	  @SuppressWarnings("unchecked")
	public String waitForWindow(int timeout) {
		    try {
		      Thread.sleep(timeout);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
		    Set<String> whNow = driver.getWindowHandles();
		    Set<String> whThen = (Set<String>) vars.get("window_handles");
		    if (whNow.size() > whThen.size()) {
		      whNow.removeAll(whThen);
		    }
		    return whNow.iterator().next();
		  }

	public void espera() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
