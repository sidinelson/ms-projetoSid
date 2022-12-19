package br.com.projetoSid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoSid.entities.Worker;

public interface WorkerRepository  extends JpaRepository<Worker, Long> {

}
