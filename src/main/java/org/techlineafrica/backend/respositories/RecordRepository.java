package org.techlineafrica.backend.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.techlineafrica.backend.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>, PagingAndSortingRepository<Record, Long> {
}