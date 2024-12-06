package goodpartner.be.controller;

import goodpartner.be.entity.Chat;
import goodpartner.be.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ChatController {
    private final ChatService chatService;

    //1.사용자 채팅 내역 조회
    @GetMapping("/chats")
    public ResponseEntity<List<Chat>> getUserChatHistory(@RequestParam UUID userId){
        List<Chat> userChatHistory = chatService.getUserChatHistory(userId);
        return ResponseEntity.ok(userChatHistory);
    }

    //2.사용자 챗봇 질문하기
    @PostMapping("/chats")
    public ResponseEntity<Chat> askQuestion(@RequestParam UUID userId,@RequestParam String message){
        Chat chat = chatService.saveChatAndGenerateResponse(userId, message);
        return ResponseEntity.ok(chat);
    }

    //3.누적 질문수 조회
    @GetMapping("/chats/count")
    public ResponseEntity<Long> getTotalQuestions(){
        Long totalQuestions = chatService.getTotalQuestions();
        return ResponseEntity.ok(totalQuestions);
    }

    //4.최근 질문 3개 조회
    @GetMapping("/chats/latest")
    public ResponseEntity<List<Chat>> getLatestChats(){
        List<Chat> latestChats = chatService.getLatestChats();
        return ResponseEntity.ok(latestChats);
    }
}
