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
    // Creates a new study session and persists it to the database
    public StudySession createSession(@RequestBody StudySession session) {
        return studySessionService.createSession(session);
    }
    @GetMapping
    // Retrieves all study sessions from the database
    public List<StudySession> getAllSessions(){
        return studySessionService.getAllSessions();
    }
    @GetMapping("/{id}")
    // Retrieves a single study session by its id, or null if not found
    public StudySession getSessionById(@PathVariable Long id) {
        return studySessionService.getSessionById(id);
    }
    @PutMapping("/{id}")
    // Updates an existing study session with new values and persists the change
    public StudySession update(@RequestBody StudySession session, @PathVariable Long id){
        return  studySessionService.updateSession(session, id);
    }
    @DeleteMapping("/{id}")
    // Deletes a study session by its id
    public void delete(@PathVariable Long id){
        studySessionService.deleteSession(id);
    }
}