package business.abstracts;

import entities.concretes.Sale;

public interface SaleService {

	void add(Sale sale);
	void delete(Sale sale);
}
