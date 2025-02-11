package org.nabihi.haithamportfolio.skill.datalayer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Skill {
    @Id
    private String id;
    private String skillId;
    private String skillName;
    private String skillLogo;
}
