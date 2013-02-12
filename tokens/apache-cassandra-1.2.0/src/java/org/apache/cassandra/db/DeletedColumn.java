package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
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
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
CFMetaData	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
marshal	TokenNameIdentifier
.	TokenNameDOT
MarshalException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
Allocator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
ByteBufferUtil	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
HeapAllocator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DeletedColumn	TokenNameIdentifier
extends	TokenNameextends
Column	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
localDeletionTime	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
bytes	TokenNameIdentifier
(	TokenNameLPAREN
localDeletionTime	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
value	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
isMarkedForDelete	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
long	TokenNamelong
getMarkedForDeleteAt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
timestamp	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
value	TokenNameIdentifier
.	TokenNameDOT
getInt	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
.	TokenNameDOT
position	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IColumn	TokenNameIdentifier
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
IColumn	TokenNameIdentifier
column	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
instanceof	TokenNameinstanceof
DeletedColumn	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
super	TokenNamesuper
.	TokenNameDOT
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
column	TokenNameIdentifier
.	TokenNameDOT
reconcile	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IColumn	TokenNameIdentifier
localCopy	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
internOrCopy	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
HeapAllocator	TokenNameIdentifier
.	TokenNameDOT
instance	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
ByteBufferUtil	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
IColumn	TokenNameIdentifier
localCopy	TokenNameIdentifier
(	TokenNameLPAREN
ColumnFamilyStore	TokenNameIdentifier
cfs	TokenNameIdentifier
,	TokenNameCOMMA
Allocator	TokenNameIdentifier
allocator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
cfs	TokenNameIdentifier
.	TokenNameDOT
internOrCopy	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
,	TokenNameCOMMA
allocator	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
allocator	TokenNameIdentifier
.	TokenNameDOT
clone	TokenNameIdentifier
(	TokenNameLPAREN
value	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
serializationFlags	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
ColumnSerializer	TokenNameIdentifier
.	TokenNameDOT
DELETION_MASK	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
validateFields	TokenNameIdentifier
(	TokenNameLPAREN
CFMetaData	TokenNameIdentifier
metadata	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
MarshalException	TokenNameIdentifier
{	TokenNameLBRACE
validateName	TokenNameIdentifier
(	TokenNameLPAREN
metadata	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
value	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
remaining	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
"A tombstone value should be 4 bytes long"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
getLocalDeletionTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
MarshalException	TokenNameIdentifier
(	TokenNameLPAREN
"The local deletion time should not be negative"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
DeletedColumn	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
localDeletionTime	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
timestamp	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
...	TokenNameELLIPSIS
names	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DeletedColumn	TokenNameIdentifier
(	TokenNameLPAREN
decomposeName	TokenNameIdentifier
(	TokenNameLPAREN
names	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
localDeletionTime	TokenNameIdentifier
,	TokenNameCOMMA
timestamp	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE