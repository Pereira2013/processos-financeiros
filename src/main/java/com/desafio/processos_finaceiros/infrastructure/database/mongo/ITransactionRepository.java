package com.desafio.processos_finaceiros.infrastructure.database.mongo;

import com.desafio.processos_finaceiros.domain.entities.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ITransactionRepository extends MongoRepository<Transaction, String> {
}

