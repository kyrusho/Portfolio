package org.nabihi.haithamportfolio.skill.datalayer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SkillRepository extends ReactiveMongoRepository<Skill, String> {
    Mono<Skill>  findSkillById(String id);
}