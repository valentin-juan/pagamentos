package br.com.alurafood.valentin.repository;

import br.com.alurafood.valentin.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
