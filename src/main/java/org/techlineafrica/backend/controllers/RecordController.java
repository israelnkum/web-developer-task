package org.techlineafrica.backend.controllers;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.techlineafrica.backend.dto.RecordDto;
import org.techlineafrica.backend.entities.Record;
import org.techlineafrica.backend.services.RecordService;

@RestController
@RequestMapping("/numbers")
@CrossOrigin("http://localhost:5173")
public class RecordController {

    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping()
    public Page<Record> getAllRecords(@RequestParam(defaultValue = "1") int pageNumber, @RequestParam(defaultValue = "10") int pageSize) {
        return recordService.getRecords(pageNumber - 1, pageSize);
    }

    @PostMapping(consumes = {"application/json"})
    public Record addRecord(@RequestBody RecordDto recordDto) {
        return recordService.save(recordDto);
    }
}