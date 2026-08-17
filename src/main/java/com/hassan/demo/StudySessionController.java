package com.hassan.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class StudySessionController {

    @Autowired
    private StudySessionService studySessionService;
    @PostMapping
    public StudySession createSession(@RequestBody StudySession session) {
        return studySessionService.createSession(session);
    }
    @GetMapping
    public List<StudySession> getAllSessions(){
        return studySessionService.getAllSessions();
    }
    @GetMapping("/{id}")
    public StudySession getSessionById(@PathVariable Long id) {
        return studySessionService.getSessionById(id);
    }
    @PutMapping("/{id}")
    public StudySession update(@RequestBody StudySession session, @PathVariable Long id){
        return  studySessionService.updateSession(session, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        studySessionService.deleteSession(id);
    }
}