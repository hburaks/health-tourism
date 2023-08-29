package com.allianz.healthtourism.model.responseDTO;

import com.allianz.healthtourism.util.BaseRequestDTO;
import com.allianz.healthtourism.util.security.UserEntity;
import lombok.Data;

import java.util.List;

@Data
public class PatientResponseDTO extends BaseRequestDTO {
    private UserEntity user;
    private List<ExaminationRecordResponseDTO> examinationRecords;
    private List<BookingResponseDTO> bookings;
    private List<AppointmentResponseDTO> appointments;
    private List<PlaneTicketResponseDTO> planeTickets;
}
