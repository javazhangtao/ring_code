package ring.repository.suppor;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryMetadata;	

import static org.mockito.Mockito.*;

public class SuperRepositoryFactory extends JpaRepositoryFactory{

	public SuperRepositoryFactory(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	protected SimpleJpaRepository<?, ?> getTargetRepository(RepositoryMetadata metadata,EntityManager entityManager) {
		JpaEntityInformation<Object, Serializable> entityMetadata = mock(JpaEntityInformation.class);   
        when(entityMetadata.getJavaType()).thenReturn((Class<Object>) metadata.getDomainType());  
        when(entityMetadata.getEntityName()).thenReturn(metadata.getDomainType().getName()); 
        return new SimpleSuperRepository<Object, Serializable>(entityMetadata, entityManager);
	}
	
	@Override
	protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
		return SimpleSuperRepository.class; 
	}
}
