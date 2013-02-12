package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cql	TokenNameIdentifier
.	TokenNameDOT
jdbc	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
math	TokenNameIdentifier
.	TokenNameDOT
BigDecimal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
JdbcDecimalTest	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testComposeDecompose	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
BigDecimal	TokenNameIdentifier
expected	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BigDecimal	TokenNameIdentifier
(	TokenNameLPAREN
"123456789123456789.987654321"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JdbcDecimal	TokenNameIdentifier
decimal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JdbcDecimal	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ByteBuffer	TokenNameIdentifier
buffer	TokenNameIdentifier
=	TokenNameEQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
decompose	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
BigDecimal	TokenNameIdentifier
actual	TokenNameIdentifier
=	TokenNameEQUAL
decimal	TokenNameIdentifier
.	TokenNameDOT
compose	TokenNameIdentifier
(	TokenNameLPAREN
buffer	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
expected	TokenNameIdentifier
,	TokenNameCOMMA
actual	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE