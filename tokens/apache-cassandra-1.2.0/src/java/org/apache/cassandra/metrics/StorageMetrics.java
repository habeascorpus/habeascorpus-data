package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
Metrics	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
Counter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
yammer	TokenNameIdentifier
.	TokenNameDOT
metrics	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
MetricName	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
StorageMetrics	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Counter	TokenNameIdentifier
load	TokenNameIdentifier
=	TokenNameEQUAL
Metrics	TokenNameIdentifier
.	TokenNameDOT
newCounter	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MetricName	TokenNameIdentifier
(	TokenNameLPAREN
"org.apache.cassandra.metrics"	TokenNameStringLiteral
,	TokenNameCOMMA
"Storage"	TokenNameStringLiteral
,	TokenNameCOMMA
"Load"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
