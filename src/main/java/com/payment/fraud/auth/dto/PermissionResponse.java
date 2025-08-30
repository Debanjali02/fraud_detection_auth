package com.payment.fraud.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionResponse {
    private String status;
    private String message;
    private Long userId;
    private String assignedPermission;
}
