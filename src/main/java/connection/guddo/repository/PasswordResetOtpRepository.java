package connection.guddo.repository;

import connection.guddo.domain.User;
import connection.guddo.model.PasswordResetOtp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetOtpRepository extends JpaRepository<PasswordResetOtp, Long> {
    Optional<PasswordResetOtp> findByOtp(String otp);
    void deleteByUser(User user);
}