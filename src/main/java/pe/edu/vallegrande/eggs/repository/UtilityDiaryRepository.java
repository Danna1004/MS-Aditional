package pe.edu.vallegrande.eggs.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.eggs.model.UtilityDiary;
import reactor.core.publisher.Flux;

public interface UtilityDiaryRepository extends ReactiveCrudRepository<UtilityDiary, Integer> {
    Flux<UtilityDiary> findByEstado(String estado);
}
