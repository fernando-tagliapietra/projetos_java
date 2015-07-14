import java.util.List;
import javax.xml.ws.WebServiceRef;
import bean.WSTurma;
import bean.WSTurmaService;

public class Teste {
	
	@WebServiceRef(wsdlLocation = "http://localhost:8080/Trabalho_interdisciplinar/WSTurmaService?wsdl")
	private static WSTurmaService notaws; 
	
	
	public static void main(String[] args) {
		notaws = new WSTurmaService();		
		WSTurma wsturma = notaws.getWSTurmaPort();
	
		try {
			List<String> turmas = wsturma.listarTurmas(); 
			System.out.println("ID  -  TEMA  -  CURSO  -  CAPACIDADE");
			
			for (String turma : turmas) {
				System.out.println(turma);
			}
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
