package com.allianz.healthtourism.model.responseDTO.plainResponseDTO;

import com.allianz.healthtourism.model.responseDTO.ExaminationRecordResponseDTO;
import com.allianz.healthtourism.util.BaseResponseDTO;
import com.allianz.healthtourism.util.security.UserEntity;
import com.allianz.healthtourism.util.security.UserResponseDTO;
import lombok.Data;

import java.util.List;

@Data
public class PatientPlainResponseDTO extends BaseResponseDTO {
    private UserPlainResponseDTO user;
}
