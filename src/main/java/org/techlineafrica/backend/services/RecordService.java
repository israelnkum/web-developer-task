package org.techlineafrica.backend.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.techlineafrica.backend.dto.RecordDto;
import org.techlineafrica.backend.entities.Record;
import org.techlineafrica.backend.respositories.RecordRepository;

@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Record save(RecordDto recordDto) {
        Record record = Record.builder().number(recordDto.getNumber()).build();

        recordRepository.save(record);

        return record;
    }

    public Page<Record> getRecords(int pageNumber, int pageSize) {
        Pageable sortedByNumber = PageRequest.of(pageNumber, pageSize, Sort.by("number"));
        return recordRepository.findAll(sortedByNumber);
    }
}