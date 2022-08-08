package com.release_notes_demo.automatic_release_notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.Exception;
import io.sentry.Sentry;
@RestController
public class SentryTestController {
    @GetMapping("/sentry")
    public void testing(){
    try {
  throw new Exception("Testing Sentry.");
} catch (Exception e) {
  Sentry.captureException(e);
}}

}


