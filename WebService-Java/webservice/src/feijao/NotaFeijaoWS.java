package feijao;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class NotaFeijaoWS {

	@WebMethod
	public double calculaMedia(double n1, double n2) {
		return (n1+n2) / 2;
	}
}
