package aula10.springdata.model.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import aula10.springdata.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	public Cidade findByNome (String nome);
	
	public Cidade findByNomeIgnoreCase(String nome);
	
	public Cidade findByLatitudeAndLongitude (Double latitude, Double longitude);
	
	public Cidade getByNome (String nome);
	
	public int countByNome (String nome);
	
	@Transactional
	public long deleteByNome (String nome);
	
	public List<Cidade> queryByNome (String nome);
	
}
