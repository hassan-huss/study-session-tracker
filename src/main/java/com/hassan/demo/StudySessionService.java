package com.hassan.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudySessionService {

    @Autowired
    private StudySessionRepository studySessionRepository;
    public StudySession createSession(StudySession session){
        return studySessionRepository.save(session);
    }
    public List<StudySession> getAllSessions() {
          return studySessionRepository.findAll();
    }
    public StudySession getSessionById(Long id) {
        return studySessionRepository.findById(id).orElse(null);
    }
    public void deleteSession (Long id){
        studySessionRepository.deleteById(id);
    }
    public StudySession updateSession(StudySession session, Long id) {
        StudySession existing = studySessionRepository.findById(id).orElse(null);
        existing.setTopic(session.getTopic());
        existing.setTrack(session.getTrack());
        existing.setDurationMinutes(session.getDurationMinutes());
        existing.setDate(session.getDate());
        existing.setWasUninterrupted(session.isWasUninterrupted());
        existing.setNotes(session.getNotes());
        return studySessionRepository.save(existing);
    }
}
